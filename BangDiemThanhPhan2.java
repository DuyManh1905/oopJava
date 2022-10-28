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
public class BangDiemThanhPhan2 {
    static class BD{
        private String ma,ten,lop;
        private double d1,d2,d3;

        public BD(String ma, String ten, String lop, double d1, double d2, double d3) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+lop+" "+d1+" "+d2+" "+d3;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<BD> l = new  ArrayList<>();
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            String ma=sc.next();
            sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.next();
            double d1=sc.nextDouble(),d2=sc.nextDouble(),d3=sc.nextDouble();
            l.add(new BD(ma, ten, lop, d1, d2, d3));         
        }
        Collections.sort(l,new Comparator<BangDiemThanhPhan2.BD>() {
            @Override
            public int compare(BD t, BD t1) {
                return t.ten.compareTo(t1.ten);
            }
        }
        );
        int cnt=1;
        for(BD x:l){
            System.out.println(cnt+" "+x);
            cnt++;
        }
    }
}
//3
//B20DCCN999
//Nguyen Van An
//D20CQCN04-B
//10.0
//9.0
//8.0
//B20DCAT001
//Le Van Nam
//D20CQAT02-B
//6.0
//6.0
//4.0
//B20DCCN111
//Tran Hoa Binh
//D20CQCN04-B
//9.0
//5.0
//6.0