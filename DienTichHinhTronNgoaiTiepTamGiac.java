package OOP_codeptit;
import java.util.*;
public class DienTichHinhTronNgoaiTiepTamGiac{
    public static Scanner sc = new Scanner (System.in);
    public static class Point{
        private double x, y;
        public Point(){
            x=0; y=0;
        }
        public Point(double a, double b){
            this.x=a; this.y=b;
        }
        public Point (Point p){
            this.x=p.x;
            this.y=p.y;
        }
        public void input(){
            x=sc.nextDouble(); 
            y=sc.nextDouble();
        }
        public double getY(){
            return y;
        }
        public double distance (Point secondPoint){
            double z, t, a, b, res;
            z = secondPoint.x;
            t = secondPoint.y;
            a = (z-x)*(z-x);
            b = (t-y)*(t-y);
            res=Math.sqrt(a+b);
            return res;
        }
        public double distance (Point p1, Point p2){
            double z, t, a, b, res;
            z = p2.x-p1.x;
            t = p2.y-p1.y;
            a = z*z; b=t*t;
            res=Math.sqrt(a+b);
            return res;
        }
        public String toString(){
            return x+" "+y;
        }
    }
    public static void main(String [] args){
        int T=sc.nextInt();
        for (int t=1; t<=T; t++){
            Point p1 = new Point();
            Point p2 = new Point();
            Point p3 = new Point();
            p1.input(); p2.input(); p3.input();
            double d1, d2, d3;
            d1=p1.distance(p2); d2=p1.distance(p3); d3=p2.distance(p3);
            if (d1+d2<=d3 || d1+d3<=d2 || d2+d3<=d1) System.out.println ("INVALID");
            else{
                double S=(d1+d2+d3)*(d1+d2-d3)*(d1-d2+d3)*(-d1+d2+d3);
                S=Math.sqrt(S)/4;
                double R = d1*d2*d3/(4*S);
                double res=Math.PI*R*R;
                System.out.printf("%.3f\n", res);
            }
        }
        
    }
}