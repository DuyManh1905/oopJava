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
public class DanhSachMonHoc {
    static class MonHoc{
        private String ma,ten;
        private int soTinChi;

        public MonHoc(String ma, String ten, int soTinChi) {
            this.ma = ma;
            this.ten = ten;
            this.soTinChi = soTinChi;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+soTinChi;
        }
        
        
    }
    public static void main(String[] args) throws FileNotFoundException{
        File file=new File("MONHOC.in");
        Scanner sc=new Scanner(file);
        int t=sc.nextInt();
        List<MonHoc> l=new ArrayList<>();
        while(t-->0){
            String ma=sc.next();
            sc.nextLine();
            String ten=sc.nextLine();
            int stc=sc.nextInt();
            l.add(new MonHoc(ma, ten, stc));
        }
        Collections.sort(l,new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc t, MonHoc t1) {
                return t.ten.compareTo(t1.ten);
            }
        });
        for(MonHoc x:l){
            System.out.println(x);
        }
    }
}
