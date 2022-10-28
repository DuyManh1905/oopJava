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
public class TimThuKhoaCuaKiThi {
    static class SV{
        private String ma,ten,ngaySinh;
        private double d1,d2,d3;

        public SV(int ma,String ten, String ngaySinh, double d1, double d2, double d3) {
            this.ma=Integer.toString(ma);
            this.ten = ten;
            this.ngaySinh = ngaySinh;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+ngaySinh+" "+String.format("%.1f", d1+d2+d3);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        double diem=Double.MIN_VALUE;
        ArrayList<SV> l =new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String ngay=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            double d3=Double.parseDouble(sc.nextLine());
            diem=Math.max(diem,(d1+d2+d3));
            l.add(new SV(i, ten, ngay, d1, d2, d3));
        }
        for(SV x:l){
            if(x.d1+x.d2+x.d3==diem){
                System.out.println(x);
            }
        }
    }
}
//3
//Nguyen Van A
//12/12/1994
//3.5
//7.0
//5.5
//Nguyen Van B
//1/9/1994
//7.5
//9.5
//9.5
//Nguyen Van C
//6/7/1994
//8.5
//9.5
//8.5