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
public class DanhSachSinhVienTrongFile1 {
    static class SV{
        private String ma,ten,lop,email;

        public SV(String ma, String ten, String lop, String email) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
            chuanHoaTen();
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+lop+" "+email;
        }
        public void chuanHoaTen(){
            String s=ten;
            s=s.trim();
            s=s.toLowerCase();
            String a[]=s.split("\\s+");
            String res="";
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length();j++){
                    if(j==0){
                        res+=Character.toUpperCase(a[i].charAt(j));
                    }
                    else{
                        res+=a[i].charAt(j);
                    }
                }
                res+=" ";
            }
            res=res.trim();
            ten=res;
        }
        
    }
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SV> l=new ArrayList<>();
        while(t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            l.add(new SV(ma, ten, lop, mail));
        }
        Collections.sort(l, new Comparator<DanhSachSinhVienTrongFile1.SV>() {
            @Override
            public int compare(SV t, SV t1) {
                return t.ma.compareTo(t1.ma);
            }
        });
        for(SV x:l){
            System.out.println(x);
        }
    }
}
