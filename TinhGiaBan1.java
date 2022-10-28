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
public class TinhGiaBan1 {
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
            return (int)Math.round(getThanhTien()*1.02);
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
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String dvt=sc.nextLine();
            int dgn=Integer.parseInt(sc.nextLine());
            int sl=Integer.parseInt(sc.nextLine());
            GB x=new GB(i, ten, dvt, dgn, sl);
            System.out.println(x);
        }
    }
}
