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
public class DanhSachKhachHangTrongFile {
    static class KH{
        private String ma,ten,gt,ngaySinh,dc;

        public KH(int ma, String ten, String gt, String ngaySinh, String dc) {
            this.ma = "KH"+String.format("%03d", ma);
            this.ten = chuanHoaTen(ten);
            this.gt = gt;
            this.ngaySinh = chuanHoaNgay(ngaySinh);
            this.dc = dc;
        }
        public String chuanHoaTen(String s) {
            s = s.toLowerCase();
            String a[] = s.split("\\s+");
            String res = "";
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length(); j++) {
                    if (j == 0) {
                        res += Character.toUpperCase(a[i].charAt(0));
                    } else {
                        res += a[i].charAt(j);
                    }
                }
                res += " ";
            }
            res = res.trim();
            return res;
        }

        public String chuanHoaNgay(String s) {
            StringBuilder sb = new StringBuilder(s);
            if (sb.charAt(1) == '/') {
                sb.insert(0, "0");
            }
            if (sb.charAt(4) == '/') {
                sb.insert(3, "0");
            }
            return sb.toString();
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+gt+" "+dc+" "+ngaySinh;
        }
        
    }
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(new File("KHACHHANG.in"));
//          Scanner sc=new Scanner(System.in);
                  
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<KH> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            l.add(new KH(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(l, new Comparator<DanhSachKhachHangTrongFile.KH>() {
            @Override
            public int compare(KH t, KH t1) {
                String a[]=t.ngaySinh.split("/");
                String b[]=t1.ngaySinh.split("/");
                if(!a[2].equals(b[2])){
                    return a[2].compareTo(b[2]);
                }
                else if(!a[1].equals(b[1])){
                    return a[1].compareTo(b[1]);
                }
                return a[0].compareTo(b[0]);
            }
        });
        for(KH x:l){
            System.out.println(x);
        }
    }
}
