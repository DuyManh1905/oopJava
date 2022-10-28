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
public class XepHangHocSinh {
    static class HS{
        private String ma,ten;
        private double diem;
        private int thuHang;

        public HS(int ma, String ten, double diem) {
            this.ma = "HS"+String.format("%02d",ma);
            this.ten = ten;
            this.diem = diem;
        }
        public String getDanhHieu(){
            if(diem<5){
                return "Yeu";
            }
            else if(diem<7){
                return "Trung Binh";
            }
            else if(diem<9){
                return "Kha";
            }
            else return "Gioi";
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+diem+" "+getDanhHieu();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<HS> l =new ArrayList<>();
        ArrayList<HS> l1 =new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            double diem=Double.parseDouble(sc.nextLine());
            l.add(new HS(i, ten, diem));
            l1.add(new HS(i, ten, diem));
        }
        Collections.sort(l,new Comparator<XepHangHocSinh.HS>() {
            @Override
            public int compare(HS t, HS t1) {
                if(t.diem>=t1.diem){
                    return -1;
                }
                return 1;
            }
        });
        int cnt=1;
        int dem=1;
        l.get(0).thuHang=1;
        for(int i=0;i<l.size()-1;i++){
            dem++;
            if(l.get(i).diem==l.get(i+1).diem){
                l.get(i+1).thuHang=cnt;
//                dem++;
            }
            else{
//                dem++;
                cnt=dem;
                l.get(i+1).thuHang=cnt;
            }
//            dem++;
        }
        for(HS x:l1){
            for(HS y:l){
                if(x.ma.equals(y.ma)){
                    System.out.println(y+" "+y.thuHang);
                }
            }
        }
    }
}
//3
//Tran Minh Hieu
//5.9
//Nguyen Bao Trung
//8.6
//Le Hong Ha
//9.2