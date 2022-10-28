/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class SapXepDonHang {
    static class MH{
        private String ten,ma;
        private int donGia,sl;

        public MH(String ten, String ma, int donGia, int sl) {
            this.ten = ten;
            this.ma = ma;
            this.donGia = donGia;
            this.sl = sl;
        }
        public String getSTT(){
            return ma.substring(1,4);
        }
        public int getGiamGia(){
            if(ma.charAt(ma.length()-1)=='1'){
                return (int)(0.5*donGia*sl);
            }
            else return (int)(0.3*donGia*sl);
        }
        public int getThanhTien(){
            return donGia*sl-getGiamGia();
        }
        @Override
        public String toString() {
            return ten+" "+ma+" "+getSTT()+" "+getGiamGia()+" "+(donGia*sl-getGiamGia());
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<MH> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String ma=sc.nextLine();
            int gia=Integer.parseInt(sc.nextLine());
            int sl=Integer.parseInt(sc.nextLine());
            l.add(new MH(ten, ma, gia, sl));
        }
        Collections.sort(l, new Comparator<SapXepDonHang.MH>() {
            @Override
            public int compare(MH t, MH t1) {
                return t.getSTT().compareTo(t1.getSTT());
            }
        });
        for(MH x:l){
            System.out.println(x);
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