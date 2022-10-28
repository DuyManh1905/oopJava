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
public class DanhSachDoanhNghiepNhanSinhVienThucTap1 {
    static class DN{
        private String ma,ten;
        private int sl;

        public DN(String ma, String ten, int sl) {
            this.ma = ma;
            this.ten = ten;
            this.sl = sl;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+sl;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<DN> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            l.add(new DN(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(l, new Comparator<DanhSachDoanhNghiepNhanSinhVienThucTap1.DN>() {
            @Override
            public int compare(DN t, DN t1) {
                if(t1.sl!=t.sl){
                    return t1.sl-t.sl;
                }
                return t.ma.compareTo(t1.ma);
            }
        });
        for(DN x:l){
            System.out.println(x);
        }
    }
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50