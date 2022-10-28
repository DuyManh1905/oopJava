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
public class DanhSachMatHang {
    static class MH{
        private String ma,ten,dvt;
        private long giaMua,giaBan;

        public MH(int i, String ten, String dvt, long giaMua, long giaBan) {
            this.ma = "MH"+String.format("%03d",i);
            this.ten = ten;
            this.dvt = dvt;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+dvt+" "+giaMua+" "+giaBan+" "+(giaBan-giaMua);
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<MH> l=new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String ten=sc.nextLine();
            String dvt=sc.next();
            long giaMua=sc.nextLong();
            long GiaBan=sc.nextLong();
            sc.nextLine();
            MH tmp=new MH(i, ten, dvt, giaMua, GiaBan);
            l.add(tmp);
        }
        Collections.sort(l,new Comparator<MH>() {
            @Override
            public int compare(MH t, MH t1) {
                long a=t.giaBan-t.giaMua;
                long b=t1.giaBan-t1.giaMua;
                if(a!=b){
                    if(a>b) return -1;
                    else return 1;
                }
                else{
                    return t.ma.compareTo(t1.ma);
                }
            }
        });
        for(MH x:l){
            System.out.println(x);
        }
    }
}
