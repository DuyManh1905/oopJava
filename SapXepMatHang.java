/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class SapXepMatHang {
    static class MatHang{
        private String ma,ten,nhom;
        private double giaMua,giaBan;

        public MatHang(int ma, String ten, String nhom, double giaMua, double giaBan) {
            this.ma = "MH"+String.format("%02d", ma);
            this.ten = ten;
            this.nhom = nhom;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+nhom+" "+String.format("%.2f", giaBan-giaMua);
        }
        
        
    }
    public static void main(String[] args) throws IOException{
        File file =new File("MATHANG.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> l =new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String nhom=sc.nextLine();
            double gm=Double.parseDouble(sc.nextLine());
            double gb=Double.parseDouble(sc.nextLine());
            l.add(new MatHang(i, ten, nhom, gm, gb));
        }
        Collections.sort(l, new Comparator<SapXepMatHang.MatHang>() {
            @Override
            public int compare(MatHang t, MatHang t1) {
                double a=t.giaBan-t.giaMua,b=t1.giaBan-t1.giaMua;
                if(a>b){
                    return -1;
                }
                else return 1;
            }
        });
        for(MatHang x:l){
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