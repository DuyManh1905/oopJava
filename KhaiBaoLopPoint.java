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
public class KhaiBaoLopPoint {

    static class Point {

        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double distancess(Point p1, Point p2) {
            double dx = p1.x - p2.x;
            double dy = p1.y - p2.y;
            double res = Math.sqrt((dx * dx) + (dy * dy));
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            System.out.printf("%.4f", p2.distancess(p1, p2));
            System.out.println();
        }
    }
}
