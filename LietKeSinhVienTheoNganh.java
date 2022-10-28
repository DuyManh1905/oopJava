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
public class LietKeSinhVienTheoNganh {
    public static String chuanHoa(String s){
        return s.toUpperCase();
    }
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
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SV> l = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            l.add(new SV(ma, ten, lop, mail));
        }
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String vt="";
            String s=sc.nextLine();
            s=chuanHoa(s);
            if(s.equals("KE TOAN")){
                vt="DCKT";
            }
            else if(s.equals("CONG NGHE THONG TIN")){
                vt="DCCN";
            }
            else if(s.equals("AN TOAN THONG TIN")){
                vt="DCAT";
            }
            else if(s.equals("VIEN THONG")){
                vt="DCVT";
            }
            else{
                vt="DCDT";
            }
            System.out.println("DANH SACH SINH VIEN NGANH "+s+":");
            for(SV x:l){
                if(x.lop.charAt(0)=='E'&&(x.ma.contains("DCCN")||x.ma.contains("DCAT"))){
                    continue;
                }
                else{
                    if(x.ma.contains(vt)){
                        System.out.println(x);
                    }
                }
            }
        }
    }
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//E16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//E15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn