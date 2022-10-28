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
public class BangKeTienLuong {
    static class TL{
        private String ma,ten,chucVu;
        private int luongNgay,snc;
        public int getLuongThang(){
            return luongNgay*snc;
        }
        public int getThuong(){
            if(snc>=25){
                return (int)(0.2*getLuongThang());
            }
            else if(snc>=22){
                return (int)(0.1*getLuongThang());
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
            else{
                return 150000;
            }
        }
        public int getThucLinh(){
            return getLuongThang()+getPhuCap()+getThuong();
        }

        public TL(int ma, String ten, String chucVu, int luongNgay, int snc) {
            this.ma = "NV"+String.format("%02d", ma);
            this.ten = ten;
            this.chucVu = chucVu;
            this.luongNgay = luongNgay;
            this.snc = snc;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+getLuongThang()+" "+getThuong()+" "+getPhuCap()+" "+(getLuongThang()+getPhuCap()+getThuong());
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        int sum=0;
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            int luong=Integer.parseInt(sc.nextLine());
            int snc=Integer.parseInt(sc.nextLine());
            String cv=sc.nextLine();
            TL x=new TL(i, ten, cv, luong, snc);
            System.out.println(x);
            sum+=x.getThucLinh();
        }
        System.out.println("Tong chi phi tien luong: "+sum);
                
    }
}
//5
//Cao Van Vu
//50000
//26
//GD
//Bui Thi Trang
//45000
//23
//PGD
//Do Van Truong
//40000
//25
//PGD
//Nguyen Van Cam
//37000
//26
//TP
//Truong Thi Tu Linh
//45000
//22
//NV