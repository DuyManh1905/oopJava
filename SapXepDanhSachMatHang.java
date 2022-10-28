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
public class SapXepDanhSachMatHang {
    static class MH{
        private String ma,ten,nhom;
        private double giaBan,giaMua;

        public MH(int ma, String ten, String nhom, double giaMua, double giaBan) {
            this.ma = ma+"";
            this.ten = ten;
            this.nhom = nhom;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+nhom+" "+String.format("%.2f", (giaBan-giaMua));
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<MH> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String nhom=sc.nextLine();
            double gb=Double.parseDouble(sc.nextLine());
            double gm=Double.parseDouble(sc.nextLine());
            l.add(new MH(i, ten, nhom, gb, gm));
        }
        Collections.sort(l, new Comparator<SapXepDanhSachMatHang.MH>() {
            @Override
            public int compare(MH t, MH t1) {
                double g1=t.giaBan-t.giaMua;
                double g2=t1.giaBan-t1.giaMua;
                if(g1<g2){
                    return 1;
                }
                return -1;
            }
        });
        for(MH x:l){
            System.out.println(x);
        }
    }
}
//3
//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//Dien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27.5
//37