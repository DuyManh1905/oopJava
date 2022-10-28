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
public class TinhDiemTrungBinh {
    static class SV{
        private String ma,ten;
        private float d1,d2,d3;
        private int thuHang;

        public SV(int ma, String ten, float d1, float d2, float d3) {
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

        public void setThuHang(int thuHang) {
            this.thuHang = thuHang;
        }
        
        public double getDiemTB(){
            double x=(d1*3+d2*3+d3*2)/8;
            String s=String.format("%.2f", x);
            return Double.parseDouble(s);
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+String.format("%.2f", getDiemTB());
        }
        
    }
    public static void main(String[] args) throws IOException{
        File file=new File("BANGDIEM.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SV> l=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            float d1=Float.parseFloat(sc.nextLine());
            float d2=Float.parseFloat(sc.nextLine());
            float d3=Float.parseFloat(sc.nextLine());
            l.add(new SV(i, ten, d1, d2, d3));
        }
        Collections.sort(l,new Comparator<TinhDiemTrungBinh.SV>() {
            @Override
            public int compare(SV t, SV t1) {
                if(t.getDiemTB()!=t1.getDiemTB()){
                    if(t.getDiemTB()>t1.getDiemTB()){
                        return -1;
                    }
                    else return 1;
                }
                return t.ma.compareTo(t1.ma);
            }
        });
        int thuHang=1;
        int cnt=1;
        System.out.print(l.get(0)+" ");
        System.out.println(thuHang);
        for(int i=1;i<l.size();i++){
            cnt+=1;
            if(l.get(i).getDiemTB()!=l.get(i-1).getDiemTB()){
                thuHang=cnt;
            }
            System.out.println(l.get(i)+" "+thuHang);
            
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