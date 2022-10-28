/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author DuyManh
 */
public class QuanLyKhachSan {
    static class KS{
        private String ma,ten;
        private int donGia;
        private double phiPhucVu;

        public KS(String ma, String ten, int donGia, double phiPhucVu) {
            this.ma = ma;
            this.ten = ten;
            this.donGia = donGia;
            this.phiPhucVu = phiPhucVu;
        }        
    }
    static class KH{
        private String ma,ten,maPhong,ngayDen,ngayDi;

        public KH(int ma, String ten, String maPhong, String ngayDen, String ngayDi) {
            this.ma = "KH"+String.format("%02d", ma);
            this.ten = ten;
            this.maPhong = maPhong;
            this.ngayDen = ngayDen;
            this.ngayDi = ngayDi;
        }
        public String getMaPhong(){
            char x= maPhong.charAt(2);
            return Character.toString(x);
        }
        public int getNgayO(){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date s = f.parse(ngayDen);
                Date e = f.parse(ngayDi);
                long temp = e.getTime() - s.getTime();
        return (int)TimeUnit.MILLISECONDS.toDays(temp);
            } catch (Exception e) {
                e.printStackTrace();
                return 1;
            }
        }

        @Override
        public String toString() {
            int a=getNgayO();
            return ma+" "+ten+" "+maPhong+" "+a+" ";
        }
    }
    public static void main(String[] args)throws FileNotFoundException{
        File file =new File("DATA.in");
        Scanner sc=new Scanner(file);
        ArrayList<KS> l1=new ArrayList<>();
        ArrayList<KH> l2=new ArrayList<>();
        int t1=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t1;i++){
            String s=sc.nextLine();
            String a[]=s.split("\\s+");
            l1.add(new KS(a[0], a[1], Integer.parseInt(a[2]), Double.parseDouble(a[3])));
        }
        int t2=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t2;i++){
            l2.add(new KH(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(l2,new Comparator<QuanLyKhachSan.KH>() {
            @Override
            public int compare(KH t, KH t1) {
                return t1.getNgayO()-t.getNgayO();
            }
        });
        for(KH x:l2){
            System.out.print(x);
//            System.out.println(x.getMaPhong());
            for(KS y:l1){
//                System.out.println(y.ma);
                if(y.ma.equals(x.getMaPhong())){
                    double z=1.0*Math.max(x.getNgayO(),1)*y.donGia*(1+y.phiPhucVu)*1.00;
                    double giam=0;
                    if(x.getNgayO()<10){
                        giam=0;
                    }
                    else if(x.getNgayO()<20){
                        giam=0.02;
                    }
                    else if(x.getNgayO()<30){
                        giam=0.04;
                    }
                    else {
                        giam=0.06;
                    }
                    z-=z*(giam);
                    System.out.printf("%.2f",z);
                    System.out.println("");
                    break;
                }
            }
        }
    }
}
//2
//C THUONG 150 0.03
//B VIP 200 0.05
//2
//Nguyen Van Hoang
//55B1
//01/01/2021
//05/01/2021
//Nguyen Trung Dung
//04C6
//01/01/2021
//10/01/2021