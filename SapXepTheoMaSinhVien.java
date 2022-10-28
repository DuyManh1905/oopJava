/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class SapXepTheoMaSinhVien {
    private String ma,ten,lop,mail;

    public SapXepTheoMaSinhVien(String ma, String ten, String lop, String mail) {
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
//        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SapXepTheoMaSinhVien> l = new ArrayList<>();
        while(sc.hasNextLine()){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            l.add(new SapXepTheoMaSinhVien(ma, ten, lop, mail));
        }
        Collections.sort(l, new Comparator<SapXepTheoMaSinhVien>() {
            @Override
            public int compare(SapXepTheoMaSinhVien t, SapXepTheoMaSinhVien t1) {               
                return t.ma.compareTo(t1.ma);
            }
        });
        for(SapXepTheoMaSinhVien x:l){
            System.out.println(x);
        }
    }
}
