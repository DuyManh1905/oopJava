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
public class DanhSachDoiTuongSinhVien3 {
    static class SV{
        private String ma,ten,ngaySinh,lop;
        private double gpa;

        public SV(int ma, String ten, String ngaySinh, String lop, double gpa) {
            this.ma = "B20DCCN"+String.format("%03d", ma);
            this.ten = chuanHoaTen(ten);
            this.ngaySinh = chuanHoaNgay(ngaySinh);
            this.lop = lop;
            this.gpa = gpa;
        }
        public String chuanHoaNgay(String s){
            StringBuilder sb=new StringBuilder(s);
            if(sb.charAt(1)=='/'){
                sb.insert(0, "0");
            }
            if(sb.charAt(4)=='/'){
                sb.insert(3, "0");
            }
            return sb.toString();
        }
        public String chuanHoaTen(String s){
            s=s.toLowerCase();
            s=s.trim();
            String a[]=s.split("\\s+");
            String res="";
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length();j++){
                    if(j==0){
                        res+=Character.toUpperCase(a[i].charAt(0));
                    }
                    else {
                        res+=a[i].charAt(j);
                    }
                }
                res+=" ";
            }
            res=res.trim();
            return res;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+lop+" "+ngaySinh+" "+String.format("%.2f",gpa);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SV> l =new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String ngay=sc.nextLine();
            double diem=Double.parseDouble(sc.nextLine());
            SV x=new SV(i, ten, ngay, lop, diem);
            l.add(x);
        }
        Collections.sort(l,new Comparator<SV>() {
            @Override
            public int compare(SV t, SV t1) {
                if(t.gpa<t1.gpa){
                    return 1;
                }
                return -1;
            }
        });
        for(SV x:l){
            System.out.println(x);
        }
                
    }
}
//2
//ngUYen Van NaM
//D20DCCN01-B
//2/12/1994
//2.17
//Nguyen QuanG hAi
//D20DCCN02-B
//1/9/1994
//3.0