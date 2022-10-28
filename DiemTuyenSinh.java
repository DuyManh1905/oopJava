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
public class DiemTuyenSinh {
    static class ThiSinh{
        private String ma,ten,danToc;
        private int vung;
        private float diem;

        public ThiSinh(int ma, String ten, String danToc, float diem, int vung) {
            this.ma = "TS"+String.format("%02d", ma);
            this.ten = ten;
            this.danToc = danToc;
            this.diem = diem;
            this.vung = vung;
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
        public float getDiemCong(){
            float sum=0;
            if(vung==1){
                sum+=1.5;
            }
            else if(vung==2){
                sum+=1;
            }
            if(danToc.equals("Kinh")){
                sum+=0;
            }
            else{
                sum+=1.5;
            }
            return sum;
        }
        public float getTongDiem(){
            return diem+getDiemCong();
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+String.format("%.1f", getTongDiem());
        }
        
    }
    public static void main(String[] args) throws IOException{
        File file=new File("THISINH.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            float diem=Float.parseFloat(sc.nextLine());
            String dantoc=sc.nextLine();
            int vung=Integer.parseInt(sc.nextLine());
            l.add(new ThiSinh(i, ten, dantoc, diem, vung));
        }
        Collections.sort(l,new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh t, ThiSinh t1) {
                if(t.getTongDiem()>t1.getTongDiem()){
                    return -1;
                }
                else if(t.getTongDiem()<t1.getTongDiem()){
                    return 1;
                }
                return t.ma.compareTo(t1.ma);
            }
        });
        for(ThiSinh x:l){
            System.out.print(x+" ");
            if(x.getTongDiem()>=20.5){
                System.out.println("Do");
            }
            else{
                System.out.println("Truot");
            }
        }
    }
}
//2
//Nguyen  hong ngat
//22
//Kinh
//1
//  Chu thi MINh
//14
//Dao
//3