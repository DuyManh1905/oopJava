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
public class TinhGiaBan2 {
    static class GB{
        private String ma,ten,dvt;
        private int donGiaNhap,sl;
        public int getPhiVanChuyen(){
            return (int)Math.round(donGiaNhap*sl*0.05);
        }
        public int getThanhTien(){
            return (int)Math.round(donGiaNhap*sl)+getPhiVanChuyen();
        }
        public int getGiaBan(){
            return (int)(Math.ceil(getThanhTien()*1.02/100.0/sl))*100;
        }

        public GB(int ma, String ten, String dvt, int donGiaNhap, int sl) {
            this.ma = "MH"+String.format("%02d", ma);
            this.ten = ten;
            this.dvt = dvt;
            this.donGiaNhap = donGiaNhap;
            this.sl = sl;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+dvt+" "+getPhiVanChuyen()+" "+getThanhTien()+" "+getGiaBan();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<GB> l = new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String dvt=sc.nextLine();
            int dgn=Integer.parseInt(sc.nextLine());
            int sl=Integer.parseInt(sc.nextLine());
            GB x=new GB(i, ten, dvt, dgn, sl);
            l.add(x);
        }
        Collections.sort(l, new Comparator<GB>() {
            @Override
            public int compare(GB t, GB t1) {
                return t1.getGiaBan()-t.getGiaBan();
            }
        });
        for(GB x:l){
            System.out.println(x);
        }
    }
}
//4
//DUONG
//KG
//7500
//150
//TRUNG
//CHUC
//10000
//225
//GAO
//KG
//14000
//118
//SUA
//HOP
//48000
//430