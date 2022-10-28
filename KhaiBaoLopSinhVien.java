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
public class KhaiBaoLopSinhVien{
    static class ThiSinh{
        private String name,ngay,lop;
        private double d1;

        public ThiSinh(String name, String ngay, String lop, double d1) {
            this.name = name;
            this.ngay = ngay;
            this.lop = lop;
            this.d1 = d1;
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
        

        @Override
        public String toString() {
            return "B20DCCN001"+" "+name+" "+lop+" "+ngay+" "+String.format("%.2f", d1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ten=sc.nextLine();
        String lop=sc.next();
        String ngay=sc.next();
        double d1=sc.nextDouble();
        ThiSinh s=new ThiSinh(ten, ngay,lop, d1);
        System.out.println(s);
    }
}
//Nguyen Hoa Binh
//D20CQCN04-B
//2/2/2002
//2