/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class LietKeSInhVienTheoKhoa {
    static class SV{
        private String ma,ten,lop,mail;

        public SV(String ma, String ten, String lop, String mail) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.mail = mail;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+lop+" "+mail;
        }
        public String getKhoa(){
            String x=lop;
            String khoa=x.substring(1,3);
            return khoa;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SV> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            l.add(new SV(ma, ten, lop, mail));
        }
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String tc=sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+tc+":");
                for(SV x:l){
                if(tc.contains(x.getKhoa())){
                    System.out.println(x);
                }
            }
        }
    }
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//D15CQKT02-B