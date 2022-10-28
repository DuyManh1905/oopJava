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
public class LapBangTinhCong {
    static class NV{
        private String ma,ten,chucVu;
        private int luongCB,snc;

        public NV(int ma, String ten, String chucVu, int luongCB, int snc) {
            this.ma = "NV"+String.format("%02d", ma);
            this.ten = ten;
            this.chucVu = chucVu;
            this.luongCB = luongCB;
            this.snc = snc;
        }
        public int getTienLuong(){
            return (int)(luongCB*snc);
        }
        public int getThuong(){
            if(snc>=25){
                return (int)(0.2*getTienLuong());
            }
            else if(snc>=22){
                return (int)(0.1*getTienLuong());
            }
            else{
                return 0;
            }
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

        @Override
        public String toString() {
            return ma+" "+ten+" "+getTienLuong()+" "+getThuong()+" "+getPhuCap()+" "+(getTienLuong()+getPhuCap()+getThuong());
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            int luong=Integer.parseInt(sc.nextLine());
            int snc=Integer.parseInt(sc.nextLine());
            String cv=sc.nextLine();
            NV x = new NV(i, ten, cv, luong, snc);
            System.out.println(x);
        }
    }
}
//3
//Cao Van Vu
//50000
//26
//GD
//Do Van Truong
//40000
//25
//PGD
//Truong Thi Tu Linh
//45000
//22
//NV