/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class BangDiemHocSinh {
    static class HS{
        private String ma,ten;
        private double a[];

        public HS(int ma, String ten, double[] a) {
            this.ma = "HS"+String.format("%02d", ma);
            this.ten = ten;
            this.a = a;
        }
        public double getTB(){
            double sum=0;
            for(int i=0;i<10;i++){
                if(i==0||i==1){
                    sum+=a[i]*2;
                }
                else{
                    sum+=a[i];
                }
            }
            sum/=12.0;
            return Math.round(sum*10.0)/10.0;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+String.format("%.1f", getTB());
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<HS> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            double a[]=new double[10];
            for(int j=0;j<10;j++){
                a[j]=sc.nextDouble();
            }
            sc.nextLine();
            l.add(new HS(i, ten, a));
        }
        Collections.sort(l, new Comparator<HS>() {
            @Override
            public int compare(HS t, HS t1) {
                if(t.getTB()>t1.getTB()){
                    return -1;
                }
                else if(t.getTB()<t1.getTB()){
                    return 1 ;
                }
                return t.ma.compareTo(t1.ma);
            }
        });
        for(HS x:l){
            System.out.print(x+" ");
            if(x.getTB()>=9){
                System.out.println("XUAT SAC");
            }
            else if(x.getTB()>=8){
                System.out.println("GIOI");
            }
            else if(x.getTB()>=7){
                System.out.println("KHA");
            }
            else if(x.getTB()>=5){
                System.out.println("TB");
            }
            else{
                System.out.println("YEU");
            }
        }
    }
}
//3
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0