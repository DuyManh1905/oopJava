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
public class CauLacBoBongDa1 {
    static class BD{
        private String ma,ten;
        private int giaVe;

        public BD(String ma, String ten, int giaVe) {
            this.ma = ma;
            this.ten = ten;
            this.giaVe = giaVe;
        }
        
        public String getVietTat(String s){
            return s;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<BD> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int gv=Integer.parseInt(sc.nextLine());
            l.add(new BD(ma, ten, gv));
        }
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s=sc.nextLine();
            String a[]=s.split("\\s+");
            String ma=a[0];
            int ve=Integer.parseInt(a[1]);
            System.out.print(ma+" ");
            for(BD x:l){
                if(ma.contains(x.ma)){
                    System.out.println(x.ten+" "+x.giaVe*ve);
                }
            }
        }
    }
}
//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000