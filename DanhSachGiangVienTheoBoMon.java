/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class DanhSachGiangVienTheoBoMon {
    static class GV{
        private String ma,ten,nganh,vietTatNganh;

        public GV(int ma, String ten, String nganh) {
            this.ma = "GV"+String.format("%02d", ma);
            this.ten = ten;
            this.nganh = nganh;
            String b=nganh.toUpperCase();
            String a[]=b.split("\\s+");
            String res="";
            for(int i=0;i<a.length;i++){
                res+=a[i].charAt(0);
            }
            this.vietTatNganh=res;
        }

        @Override
        public String toString() {
            nganh=nganh.toUpperCase();
            String a[]=nganh.split("\\s+");
            String res="";
            for(int i=0;i<a.length;i++){
                res+=a[i].charAt(0);
            }
            return ma+" "+ten+" "+res;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<GV> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String nganh=sc.nextLine();
            l.add(new GV(i, ten, nganh));
        }
        
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String bm=sc.nextLine();
            String y=bm.toUpperCase();
            String a[]=y.split("\\s+");
            String res="";
            for(int i=0;i<a.length;i++){
                res+=a[i].charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+res+":");
            for(GV x:l){
               if(x.nganh.equals(bm)){
                   System.out.println(x);
               } 
            }
        }
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//DANH SACH GIANG VIEN BO MON CNPM: