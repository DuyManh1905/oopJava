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
public class ChuViTamGiac {
    static class Point{
        private double x,y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double distance(Point p1,Point p2){
            return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y, 2));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            double x1=sc.nextDouble();
            double y1=sc.nextDouble();
            double x2=sc.nextDouble();
            double y2=sc.nextDouble();
            double x3=sc.nextDouble();
            double y3=sc.nextDouble();
            Point p1=new Point(x1, y1);
            Point p2=new Point(x2, y2);
            Point p3=new Point(x3, y3);
            double d1=p1.distance(p1, p2);
            double d2=p1.distance(p2, p3);
            double d3=p1.distance(p1, p3);
            if(d1+d2<=d3 || d2+d3<=d1 || d1+d3<=d2){
                System.out.println("INVALID");
            }
            else{
                System.out.printf("%.3f",d1+d2+d3);
                System.out.println("");
            }
        }
    }
}
