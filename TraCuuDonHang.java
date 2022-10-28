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
public class TraCuuDonHang {
    static class DonHang{
        private String ten,ma;
        private int gia,sl;

        public DonHang(String ten, String ma, int gia, int sl) {
            this.ten = ten;
            this.ma = ma;
            this.gia = gia;
            this.sl = sl;
        }
        
        public String getStt(){
            return ma.substring(1,4);
        }
        public int getGiamGia(){
            char x=ma.charAt(4);
            if(x=='1'){
                return 5*gia*sl/10;
            }
            else{
                return 3*gia*sl/10;
            }
        }
        public int getDonGia(){
            return gia*sl - getGiamGia();
        }

        @Override
        public String toString() {
            return ten+" "+ma+" "+getStt()+" "+getGiamGia()+" "+getDonGia();
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String ma=sc.nextLine();
            int gia=Integer.parseInt(sc.nextLine());
            int sl=Integer.parseInt(sc.nextLine());
            DonHang tmp=new DonHang(ten, ma, gia, sl);
            System.out.println(tmp);
        }
    }
}
//3
//Kaki 2
//K0252
//80000
//15
//Jean 1
//J2011
//200000
//24
//Jean 2
//J0982
//150000
//12