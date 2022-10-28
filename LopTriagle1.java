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
class Point {
    private float x, y;
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    
    public static Point nextPoint(Scanner sc) {
        return new Point(sc.nextFloat(), sc.nextFloat());
    }
}

class Triangle {
    private Point c1, c2, c3;
    public Triangle(Point c1, Point c2, Point c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    public boolean valid() {
        float d1 = (float) Math.sqrt(Math.pow(c1.getX() - c2.getX(), 2) + Math.pow(c1.getY() - c2.getY(), 2));
        float d2 = (float) Math.sqrt(Math.pow(c1.getX() - c3.getX(), 2) + Math.pow(c1.getY() - c3.getY(), 2));
        float d3 = (float) Math.sqrt(Math.pow(c2.getX() - c3.getX(), 2) + Math.pow(c2.getY() - c3.getY(), 2));
        if (d1 == 0 || d2 == 0 || d3 == 0 || d1 + d2 <= d3 || d1 + d3 <= d2 || d2 + d3 <= d1) {
            return false;
        }
        return true;
    }

    public String getPerimeter() {
        float d1 = (float) Math.sqrt(Math.pow(c1.getX() - c2.getX(), 2) + Math.pow(c1.getY() - c2.getY(), 2));
        float d2 = (float) Math.sqrt(Math.pow(c1.getX() - c3.getX(), 2) + Math.pow(c1.getY() - c3.getY(), 2));
        float d3 = (float) Math.sqrt(Math.pow(c2.getX() - c3.getX(), 2) + Math.pow(c2.getY() - c3.getY(), 2));
        String x = String.format("%.3f", d1 + d2 + d3);
        return x;
    }

}

public class LopTriagle1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
