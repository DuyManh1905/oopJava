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
import java.util.regex.Pattern;
//import sun.java2d.pipe.SpanShapeRenderer;

/**
 *
 * @author DuyManh
 */
public class DanhSachLuuTru {
    private static int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    
    static class user{
        private String ma,ten,maPhong,ngayDen,ngayDi;

        public user(int ma, String ten, String maPhong, String ngayDen, String ngayDi) {
            this.ma = "KH"+String.format("%02d", ma);
            this.ten = ten;
            this.maPhong = maPhong;
            this.ngayDen = ngayDen;
            this.ngayDi = ngayDi;
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
                return (int)res;
            }catch(ParseException e){
                e.printStackTrace();
            }
            return -1;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+maPhong+" "+getNgay();
        }
        
    }
    public static void main(String[] args) throws IOException{
        File file = new File("KHACH.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<user> l =new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String ma=sc.nextLine();
            String ngayDen=sc.nextLine();
            String ngayDi=sc.nextLine();
            l.add(new user(i, ten, ma, ngayDen, ngayDi));
        }
        Collections.sort(l, new Comparator<DanhSachLuuTru.user>() {
            @Override
            public int compare(user t, user t1) {
                return t1.getNgay()-t.getNgay();
            }
        });
        for(user x:l){
            System.out.println(x);
        }
    }
}
//2
//Nguyen Van Hoang
//55B1
//01/01/2021
//05/01/2021
//Nguyen Trung Dung
//04C6
//01/01/2021
//10/01/2021