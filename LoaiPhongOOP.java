/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class LoaiPhongOOP {
    private static class LoaiPhong implements Comparable<LoaiPhong>{
        private String ma,ten;
        private int gia;
        private double phi;

        public LoaiPhong(String s) {
            String a[]=s.split("\\s+");
            ma=a[0];
            ten=a[1];
            gia=Integer.parseInt(a[2]);
            phi=Double.parseDouble(a[3]);
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+gia+" "+phi;
        }
        @Override
        public int compareTo(LoaiPhong b){
            return this.ten.compareTo(b.ten);
        }
        
    }
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
