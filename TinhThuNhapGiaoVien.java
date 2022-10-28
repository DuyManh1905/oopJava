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
public class TinhThuNhapGiaoVien {
    static class GiaoVien{
        private String ma,ten;
        private long luong;

        public GiaoVien(String ma, String ten, long luong) {
            this.ma = ma;
            this.ten = ten;
            this.luong = luong;
        }
        public long getHeSoLuong(){
            String x=ma.substring(2,4);
            int y=Integer.parseInt(x);
            return y;
        }
        public long getPhuCap(){
            String x=ma.substring(0,2);
            if(x.equals("HT")){
                return 2000000;
            }
            else if(x.equals("HP")){
                return 900000;
            }
            else{
                return 500000;
            }
        }
        public long getLuong(){
            
            return luong*getHeSoLuong()+getPhuCap();
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+getHeSoLuong()+" "+getPhuCap()+" "+getLuong();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ma=sc.next();
        sc.nextLine();
        String ten=sc.nextLine();
        long luong=sc.nextLong();
        GiaoVien x=new GiaoVien(ma, ten, luong);
        System.out.println(x);
    }
}
