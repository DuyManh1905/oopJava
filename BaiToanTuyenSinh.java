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
public class BaiToanTuyenSinh {
    static class SV{
        private String ma,ten;
        private double d1,d2,d3;

        public SV(String ma, String ten, double d1, double d2, double d3) {
            this.ma = ma;
            this.ten = ten;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }
        public double getUuTien(){
            String x=ma.substring(0, 3);
            if(x.equals("KV1")){
                return 0.5;
            }
            else if(x.equals("KV2")){
                return 1.0;
            }
            else return 2.5;
        }
        public double getTonmgDiem(){
            return d1*2+d2+d3;
        }

        @Override
        public String toString() {
            String x="";
            String y="";
            if((int)getUuTien()==getUuTien()){
                y=String.format("%.0f", getUuTien());
            }
            else{
                y=String.format("%.1f", getUuTien());
            }
            if((int)getTonmgDiem()==getTonmgDiem()){
                x=String.format("%.0f", getTonmgDiem());
            }
            else{
                x=String.format("%.1f", getTonmgDiem());
            }
            return ma+" "+ten+" "+y+" "+x;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ma=sc.nextLine();
        String ten=sc.nextLine();
        double d1=sc.nextDouble(),d2=sc.nextDouble(),d3=sc.nextDouble();
        SV x= new SV(ma, ten, d1, d2, d3);
        System.out.print(x+" ");
        if(x.getTonmgDiem()+x.getUuTien()>=24){
            System.out.println("TRUNG TUYEN");
        }
        else{
            System.out.println("TRUOT");
        }
    }
}
