/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class QuanLyKhoXangDau {
    static class MH{
        private String ma;
        private long sl;

        public MH(String ma, long sl) {
            this.ma = ma;
            this.sl = sl;
        }
        
        public String getTen(){
            String x=ma.substring(ma.length()-2,ma.length());
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
            String y=ma.substring(ma.length()-2,ma.length());
            if(y.equals("TN")){
                return 0;
            }
            char x=ma.charAt(0);
            if(x=='X'){
                return (long)(0.03*getThanhTien());
            }
            else if(x=='D'){
                return (long)(0.035*getThanhTien());
            }
            else return (long)(0.02*getThanhTien());
        }
        public long getThanhTien(){
            return getDonGia()*sl;
        }
        public long getThanhToan(){
            return (getThanhTien()+getThue());
        }

        @Override
        public String toString() {
            return ma+" "+getTen()+" "+getDonGia()+" "+getThue()+" "+getThanhToan();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            MH x=new MH(sc.next(), sc.nextLong());
            System.out.println(x);
        }
    }
}
//3
//N89BP 4500
//D00BP 3500
//X92SH 2600