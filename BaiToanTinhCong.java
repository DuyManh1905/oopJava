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
public class BaiToanTinhCong {
    static class NV{
        private String ma,ten,chucVu;
        private int luong,snc;

        public NV(String ten, String chucVu, int luong, int snc) {
            this.ma = "NV01";
            this.ten = ten;
            this.chucVu = chucVu;
            this.luong = luong;
            this.snc = snc;
        }
        public int getPhuCap(){
            if(chucVu.equals("GD")){
                return 250000;
            }
            else if(chucVu.equals("PGD")){
                return 200000;
            }
            else if(chucVu.equals("TP")){
                return 180000;
            }
            else return 150000;
        }
        public int getLuong(){
            return snc*luong;
        }
        public int getThuong(){
            if(snc>=25){
                return (int)(0.2*getLuong());
            }
            else if(snc>=22){
                return (int)(0.1*getLuong());
            }
            else return 0;
        }
        public int getThuNhap(){
            return getLuong()+getPhuCap()+getThuong();
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+getLuong()+" "+getThuong()+" "+getPhuCap()+" "+getThuNhap();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ten=sc.nextLine();
        int luong=sc.nextInt();
        int snc=sc.nextInt();
        String cv=sc.next();
        NV x=new NV(ten, cv, luong, snc);
        System.out.println(x);
    }
}
//Bui Thi Trang
//45000
//23
//PGD