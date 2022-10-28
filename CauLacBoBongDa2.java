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
public class CauLacBoBongDa2 {
    static class BD{
        private String ma,ten;
        private int giaVe;
        private String matd;
        private int giaTong;

        public BD(String ma, String ten, int giaVe) {
            this.ma = ma;
            this.ten = ten;
            this.giaVe = giaVe;
        }
        
        public String getVietTat(String s){
            return s;
        }

        @Override
        public String toString() {
           return matd+" "+ten+" "+giaTong;
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
            String mai=a[0];
            int ve=Integer.parseInt(a[1]);
//            System.out.print(ma+" ");
            for(BD x:l){
                if(mai.contains(x.ma)){
                    x.matd=mai;
                    x.giaTong=x.giaVe*ve;
                }
            }
        }
        Collections.sort(l, new Comparator<BD>() {
                @Override
                public int compare(BD t, BD t1) {
                    if(t.giaTong!=t1.giaTong){
                        return t1.giaTong-t.giaTong;
                    }
                    else return t.ten.compareTo(t1.ten);
                }
            });
            for(BD o:l){
                System.out.println(o);
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