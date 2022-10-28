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
public class BangTheoDoiNhapXuatHang {
    static class MH{
        private String ma;
        private int sl;

        public MH(String ma, int sl) {
            this.ma = ma;
            this.sl = sl;
        }
        public int getSoLuongXuatHang(){
            if(ma.charAt(0)=='A'){
                return (int)Math.round(sl*6/10.0);
            }
            else{
                return (int)Math.round(sl*7/10.0);
            }
        }
        public int getDonGia(){
            if(ma.charAt(ma.length()-1)=='Y'){
                return 110000;
            }
            else return 135000;
        }
        public int getTien(){
            return getDonGia()*getSoLuongXuatHang();
        }
        public int getThue(){
            char dau=ma.charAt(0);
            char cuoi=ma.charAt(ma.length()-1);
            if(dau=='A'&&cuoi=='Y'){
                return (int)Math.round(getTien()*8.0/100.0);
            }
            else if(dau=='A'&&cuoi=='N'){
                return (int)Math.round(getTien()*11.0/100.0);
            }
            else if(dau=='B'&&cuoi=='Y'){
                return (int)Math.round(getTien()*17.0/100.0);
            }
            else {
                return (int)Math.round(getTien()*22.0/100.0);
            }
        }

        @Override
        public String toString() {
            return ma+" "+sl+" "+getSoLuongXuatHang()+" "+getDonGia()+" "+getTien()+" "+getThue();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            MH x=new MH(sc.next(), sc.nextInt());
            System.out.println(x);
        }
    }
}
//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582