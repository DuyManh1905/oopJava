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
public class SapXepSinhVienTheoLop {
    private String ma,ten,lop,mail;

    public SapXepSinhVienTheoLop(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+mail;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SapXepSinhVienTheoLop> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            l.add(new SapXepSinhVienTheoLop(ma, ten, lop, mail));
        }
        Collections.sort(l, new Comparator<SapXepSinhVienTheoLop>() {
            @Override
            public int compare(SapXepSinhVienTheoLop t, SapXepSinhVienTheoLop t1) {
                if(!t.lop.equals(t1.lop)){
                    return t.lop.compareTo(t1.lop);
                }
                return t.ma.compareTo(t1.ma);
            }
        });
        for(SapXepSinhVienTheoLop x:l){
            System.out.println(x);
        }
    }
}
