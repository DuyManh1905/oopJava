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
public class SapXepBangGiaXangDau {
    static class MH{
        private String ma;
        private long sl;

        public MH(String ma, long sl) {
            this.ma = ma;
            this.sl = sl;
        }
        
        public String getTen(){
            String x=ma.substring(3);
            if(x.equals("BP")){
                return "British Petro";
            }
            else if(x.equals("ES")){
                return "Esso";
            }
            else if(x.equals("SH")){
                return "Shell";
            }
            else if(x.equals("CA")){
                return "Castrol";
            }
            else if(x.equals("MO")){
                return "Mobil";
            }
            else{
                return "Trong Nuoc";
            }
            
        }
        public long getDonGia(){
            char x=ma.charAt(0);
            if(x=='X'){
                return 128000;
            }
            else if(x=='D'){
                return 11200;
            }
            else return 9700;
        }
        public long getThue(){
            String y=ma.substring(3);
            if(y.equals("TN")){
                return 0;
            }
            char x=ma.charAt(0);
            if(x=='X'){
                return (long)(getThanhTien()*3/100);
            }
            else if(x=='D'){
                return (long)(getThanhTien()*3.5/100);
            }
            else return (long)(getThanhTien()*2/100);
        }
        public long getThanhTien(){
            return getDonGia()*sl;
        }
        public long getThanhToan(){
            return getThanhTien()+getThue();
        }

        @Override
        public String toString() {
            return ma+" "+getTen()+" "+getDonGia()+" "+getThue()+" "+getThanhToan();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<MH> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            MH x=new MH(sc.next(), sc.nextLong());
            l.add(x);
        }
        Collections.sort(l,new Comparator<SapXepBangGiaXangDau.MH>() {
            @Override
            public int compare(MH t, MH t1) {
                if(t.getThanhToan()<t1.getThanhToan()) return 1;
                return -1;
            }
        });
        for(MH x:l){
            System.out.println(x);
        }
    }
}
//3
//N89BP 4500
//D00BP 3500
//X92SH 2600