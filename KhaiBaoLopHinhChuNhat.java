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
public class KhaiBaoLopHinhChuNhat {
    static class Rectange{
        private double wi,he;
        private String color;
//
        public Rectange(double wi, double he, String color) {
            this.wi = wi;
            this.he = he;
            this.color = color;
            chuanHoaMau();
        }
//      
        public double findArea(){
            return this.he*this.wi;
        }
//
        public double findPerimeter(){
            return 2*(he+wi);
        }
//          
        public void chuanHoaMau(){
            color=color.toLowerCase();
            String res="";
            res+=Character.toUpperCase(color.charAt(0));
            for(int i=1;i<color.length();i++){
                res+=color.charAt(i);
            }
            color=res;
        }

        @Override
        public String toString() {
            if(he>0 && wi>0)
            return (int)findPerimeter()+" "+(int)findArea()+" "+color;
            else
                return "INVALID";
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        String mau=sc.next();
        Rectange r=new Rectange(x, y, mau);
        System.out.println(r);
    }
}
