/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class XepLoai {
    static class SV{
        private String ma,ten;
        private double d1,d2,d3;

        public SV(int ma, String ten, double d1, double d2, double d3) {
            this.ma = "SV"+String.format("%02d", ma);
            this.ten = ten;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            chuanHoaTen();
        }
        public void chuanHoaTen(){
            String s=ten;
            s=s.trim();
            s=s.toLowerCase();
            String a[]=s.split("\\s+");
            String res="";
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length();j++){
                    if(j==0){
                        res+=Character.toUpperCase(a[i].charAt(j));
                    }
                    else{
                        res+=a[i].charAt(j);
                    }
                }
                res+=" ";
            }
            res=res.trim();
            ten=res;
        }
        public double getDiemTb(){
            return d1*0.25+ d2*0.35+d3*0.4;
        }
        public String getDanhHieu(){
            if(getDiemTb()>=8){
                return "GIOI";
            }
            else if(getDiemTb()>=6.5){
                return "KHA";
            }
            else if(getDiemTb()>=5){
                return "TRUNG BINH";
            }
            else{
                return "KEM";
            }
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+String.format("%.2f", getDiemTb())+" "+getDanhHieu();
        }
        
    }
    public static void main(String[] args) throws IOException{
        File file=new File("BANGDIEM.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SV> l =new ArrayList<>();
        for(int i=1;i<=t;i++){
            String s=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            double d3=Double.parseDouble(sc.nextLine());
            l.add(new SV(i, s, d1, d2, d3));
        }
        Collections.sort(l, new Comparator<XepLoai.SV>() {
            @Override
            public int compare(SV t, SV t1) {
                if(t.getDiemTb()>t1.getDiemTb()){
                    return -1;
                }
                else return 1;
            }
        });
        for(SV x:l){
            System.out.println(x);
        }
    }
}
//2
// ha Thi kieu     anh
//7
//6
//7
//Pham    THI  HAO
//6
//7
//6