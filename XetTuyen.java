/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class XetTuyen {
    static class SV{
        private String ma,ten,ngay;
        private double d1,d2;

        public SV(int ma, String ten, String ngay, double d1, double d2) {
            this.ma = "PH"+String.format("%02d", ma);
            this.ten = ten;
            this.ngay = ngay;
            this.d1 = d1;
            this.d2 = d2;
            chuanHoaTen();
            chuanHoaNgay();
        }
        public void chuanHoaNgay(){
            StringBuilder x=new StringBuilder(ngay);
            if(x.charAt(1)=='/'){
                x.insert(0, '0');
            }
            if(x.charAt(4)=='/'){
                x=x.insert(3, '0');
            }
            ngay=x.toString();
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
        public int getTuoi(){
            String x=ngay.substring(6,10);
            int a=Integer.parseInt(x);
            return 2021-a;
        }
        public long getDiemTB(){
            double dc=0;
            if(d1>=8 && d2>=8){
                dc=1;
            }
            else if(d1>=7.5 && d2>= 7.5){
                dc=0.5;
            }
            double res=(d1+d2)/2 + dc;
            long r=Math.round(res);
            if(r>10){
                r=10;
            }
            return r;
        }
        public String getTT(){
            if(getDiemTB()>=9){
                return "Xuat sac";
            }
            else if(getDiemTB()==8){
                return "Gioi";
            }
            else if(getDiemTB()==7){
                return "Kha";
            }
            else if(getDiemTB()>=5){
                return "Trung binh";
            }
            else return "Truot";
        }

        @Override
        public String toString() {
            
            return ma+" "+ten+" "+getTuoi()+" "+getDiemTB()+" "+getTT();
        }
        
    }
    public static void main(String[] args) throws IOException{
        File file=new File("XETTUYEN.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SV> l =new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String ngay=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            l.add(new SV(i, ten, ngay, d1, d2));
        }
        for(SV x:l){
            System.out.println(x);
        }
    }
}
//3
//Doan Thi Kim
//13/03/1982
//8
//9.5
//dinh Thi NGOC HA
//3/9/1996
//6.5
//8
//  tran thanh mai
//12/9/2004
//8
//9