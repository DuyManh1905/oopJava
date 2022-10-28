/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class DanhSachDoanhNghiep {
    static class DoanhNghiep{
        private String ma,ten;
        private int sl;

        public DoanhNghiep(String ma, String ten, int sl) {
            this.ma = ma;
            this.ten = ten;
            this.sl = sl;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+sl;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DN.in");
        Scanner sc=new Scanner(file);
        int t=sc.nextInt();
        List<DoanhNghiep> l=new ArrayList<>();
        while(t-->0){
            String ma=sc.next();
            sc.nextLine();
            String ten=sc.nextLine();
            int sl=sc.nextInt();
            l.add(new DoanhNghiep(ma, ten, sl));
        }
        Collections.sort(l,new Comparator<DanhSachDoanhNghiep.DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep t, DoanhNghiep t1) {
                return t.ma.compareTo(t1.ma);
            }
        });
        for(DoanhNghiep x:l){
            System.out.println(x);
        }
    }
}
