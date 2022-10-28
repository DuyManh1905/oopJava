/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class DanhSachDoiTuongSinhVien1 {
    static class SV{
        private String ma,ten,ngaySinh,lop;
        private double gpa;

        public SV(int ma, String ten, String ngaySinh, String lop, double gpa) {
            this.ma = "B20DCCN"+String.format("%03d", ma);
            this.ten = ten;
            this.ngaySinh = chuanHoaTen(ngaySinh);
            this.lop = lop;
            this.gpa = gpa;
        }
        public String chuanHoaTen(String s){
            StringBuilder sb=new StringBuilder(s);
            if(sb.charAt(1)=='/'){
                sb.insert(0, "0");
            }
            if(sb.charAt(4)=='/'){
                sb.insert(3, "0");
            }
            return sb.toString();
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+lop+" "+ngaySinh+" "+String.format("%.2f",gpa);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String ngay=sc.nextLine();
            double diem=Double.parseDouble(sc.nextLine());
            SV x=new SV(i, ten, ngay, lop, diem);
            System.out.println(x);
        }
    }
}
