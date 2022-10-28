/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.io.*;
import java.util.*;

/**
 *
 * @author DuyManh
 */
public class DanhSachSanPham2 {
    static class SanPham{
        private String ma,ten;
        private int gia,baoHanh;

        public SanPham(String ma, String ten, int gia, int baoHanh) {
            this.ma = ma;
            this.ten = ten;
            this.gia = gia;
            this.baoHanh = baoHanh;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+gia+" "+baoHanh;
        }
        
    }
    public static void main(String[] args) throws IOException{
        File file = new File("SANPHAM.in");
        Scanner sc=new Scanner(file);
        List<SanPham> l =new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int gia=Integer.parseInt(sc.nextLine());
            int bh=Integer.parseInt(sc.nextLine());
            l.add(new SanPham(ma, ten, gia, bh));
        }
        Collections.sort(l,new Comparator<DanhSachSanPham2.SanPham>() {
            @Override
            public int compare(SanPham t, SanPham t1) {
                if(t.gia!=t1.gia){
                    return t1.gia-t.gia;
                }
                return t.ma.compareTo(t1.ma);
            }
        });
        for(SanPham x:l){
            System.out.println(x);
        }
    }
}
//2
//KC740
//May khoan KC1
//39
//18
//KC742
//May cat KC2
//46
//12