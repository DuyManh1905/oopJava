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
public class BangThuNhapGiaoVien {
    static class GV{
        private String ma,ten;
        private int luongCB;

        public GV(String ma, String ten, int luongCB) {
            this.ma = ma;
            this.ten = ten;
            this.luongCB = luongCB;
        }
        public String getChucVu(){
            return ma.substring(0,2);
        }
        public int getPhuCap(){
            String x=ma.substring(0,2);
            if(x.equals("HT")){
                return 2000000;
            }
            else if(x.equals("HP")){
                return 900000;
            }
            else return 500000;
        }
        public int getHeSoLuong(){
            String x=ma.substring(2,4);
            int a=Integer.parseInt(x);
            return a;
        }
        public int getThuNhap(){
            return getHeSoLuong()*luongCB+getPhuCap();
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+getHeSoLuong()+" "+getPhuCap()+" "+getThuNhap();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        int ht=0,hp=0;
        for(int i=1;i<=t;i++){
            GV x = new GV(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            if(x.getChucVu().equals("HT")){
                ht++;
            }
            if(x.getChucVu().equals("HP")){
                hp++;
            }
            if(x.getChucVu().equals("HP")&&hp>2){
                continue;
            }
            if(x.getChucVu().equals("HT")&&ht>1){
                continue;
            }
            System.out.println(x);
        }
    }
}
//3
//GV01
//Nguyen Kim Loan
//1420000
//HT05
//Hoang Thanh Tuan
//1780000
//GV02
//Tran Binh Nguyen
//1468000