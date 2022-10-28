/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

/**
 *
 * @author DuyManh
 */
public class TinhTienPhong {
    static class KhachHang{
        private String ma,ten,soPhong,ngayDen,ngayDi;
        private int dv;

        public KhachHang(int ma, String ten, String soPhong, String ngayDen, String ngayDi, int dv) {
            this.ma = "KH"+String.format("%02d", ma);
            this.ten = ten;
            this.soPhong = soPhong;
            this.ngayDen = chuanHoaNgay(ngayDen);
            this.ngayDi = chuanHoaNgay(ngayDi);
            this.dv = dv;
            chuanHoaTen();
        }
        public static String chuanHoaNgay(String q){
            StringBuilder x=new StringBuilder(q);
            if(x.charAt(1)=='/'){
                x.insert(0, '0');
            }
            if(x.charAt(4)=='/'){
                x=x.insert(3, '0');
            }
            return x.toString();
        }
        public void chuanHoaTen(){
            String s=ten;
            s=s.trim();
            s=s.toLowerCase();
            String a[]=s.split("\\s+");
            String res="";
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length();j++){
                    if(j==0){
                        res+=Character.toUpperCase(a[i].charAt(j));
                    }
                    else{
                        res+=a[i].charAt(j);
                    }
                }
                res+=" ";
            }
            res=res.trim();
            ten=res;
        }
        public int getNgay(){
            SimpleDateFormat sf= new SimpleDateFormat("dd/MM/yyyy");
            String x=ngayDen;
            String y=ngayDi;
            try{
                Date start = sf.parse(x);
                Date end = sf.parse(y);
                long startV=start.getTime();
                long endV=end.getTime();
                long tmp=Math.abs(startV-endV);
                long res= tmp/(24*60*60*1000);
                return (int)res+1;
            }catch(ParseException e){
                e.printStackTrace();
            }
            return -1;
        }
        public int getGia(){
            if(soPhong.charAt(0)=='1'){
                return 25*getNgay()+dv;
            }
            else if(soPhong.charAt(0)=='2'){
                return 34*getNgay()+dv;
            }
            else if(soPhong.charAt(0)=='3'){
                return 50*getNgay()+dv;
            }
            else return 80*getNgay()+dv;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+soPhong+" "+getNgay()+" "+getGia();
        }
        
    }
    public static void main(String[] args) throws IOException{
        File file = new File("KHACHHANG.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> l =  new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String sp=sc.nextLine();
            String ngay1=sc.nextLine();
            String ngay2=sc.nextLine();
            int dv=Integer.parseInt(sc.nextLine());
            l.add(new KhachHang(i, ten, sp, ngay1, ngay2, dv));
        }
        Collections.sort(l,new Comparator<TinhTienPhong.KhachHang>() {
            @Override
            public int compare(KhachHang t, KhachHang t1) {
                 return t1.getGia()-t.getGia();
            }
        });
        for(KhachHang x:l){
            System.out.println(x);
        }
    }
}
//3
//Huynh VAN Thanh   
//103 
//5/6/2010   
//5/6/2010   
//15
//le   DUC cong  
//106 
//08/3/2010   
//1/5/2010   
//220
//Tran Thi Bich Tuyen   
//207 
//10/4/2010   
//21/4/2010   
//96