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
public class DanhSachMonThi {
    static class MonThi{
        private String ma,ten,hinhThuc;

        public MonThi(String ma, String ten, String hinhThuc) {
            this.ma = ma;
            this.ten = ten;
            this.hinhThuc = hinhThuc;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+hinhThuc;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException{
        File file=new File("MONHOC.in");
        Scanner sc2=new Scanner(file);
        int t=sc2.nextInt();
        sc2.nextLine();
        List<MonThi> l=new ArrayList<>();
        while(t-->0){
            String ma=sc2.next();
            sc2.nextLine();
            String ten=sc2.nextLine();
            String hinhThuc=sc2.nextLine();
            MonThi tmp=new MonThi(ma, ten, hinhThuc);
            l.add(tmp);
        }
        Collections.sort(l,new Comparator<DanhSachMonThi.MonThi>() {
            @Override
            public int compare(MonThi t, MonThi t1) {
                 return  t.ma.compareTo(t1.ma);
            }
        });
        for(MonThi x:l){
            System.out.println(x);
        }
    }
}
