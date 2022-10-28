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
public class KhaiBaoThiSinh {
    static class ThiSinh{
        private String name,ngay;
        private double d1,d2,d3;

        public ThiSinh(String name, String ngay, double d1, double d2, double d3) {
            this.name = name;
            this.ngay = ngay;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }

        @Override
        public String toString() {
            return name+" "+ngay+" "+String.format("%.1f", d1+d2+d3);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ten=sc.nextLine();
        String ngay=sc.next();
        double d1=sc.nextDouble(),d2=sc.nextDouble(),d3=sc.nextDouble();
        ThiSinh s=new ThiSinh(ten, ngay, d1, d2, d3);
        System.out.println(s);
    }
}
//Nguyen Hoang Ha
//11/10/2001
//4.5
//10.0
//5.5