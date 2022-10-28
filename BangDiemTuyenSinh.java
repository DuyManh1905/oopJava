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
public class BangDiemTuyenSinh {
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
            if(ma.contains("KV1")){
                return 0.5;
            }
            else if(ma.contains("KV2")){
                return 1.0;
            }
            else return 2.5;
        }
        public double getTongDiem(){
            return d1*2+d2+d3;
        }
        public String getDanhHieu(){
            double td=d1*2+d2+d3+getUuTien();
            if(td>=24){
                return "TRUNG TUYEN";
            }
            else return "TRUOT";
        }
        public String chuanHoaDiem(double x){
            if((int)(x)==x){
                return String.format("%.0f",x);
            }
            else return String.format("%.1f", x);
        }
        @Override
        public String toString() {
            return ma+" "+ten+" "+chuanHoaDiem(getUuTien())+" "+chuanHoaDiem(getTongDiem())+" "+getDanhHieu();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            SV x=new SV(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            System.out.println(x);
        }
    }
}
//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7