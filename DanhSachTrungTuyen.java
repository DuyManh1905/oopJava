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
public class DanhSachTrungTuyen {

    static class SV {

        private String ma, ten, trangThai;
        private double d1, d2, d3;

        public SV(String ma, String ten, double d1, double d2, double d3) {
            this.ma = ma;
            this.ten = ten;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            chuanHoaTen();
        }

        public void chuanHoaTen() {
            String s = ten;
            s = s.trim();
            s = s.toLowerCase();
            String a[] = s.split("\\s+");
            String res = "";
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length(); j++) {
                    if (j == 0) {
                        res += Character.toUpperCase(a[i].charAt(j));
                    } else {
                        res += a[i].charAt(j);
                    }
                }
                res += " ";
            }
            res = res.trim();
            ten = res;
        }

        public double getUuTien() {
            String x = ma.substring(0, 3);
            if (x.equals("KV1")) {
                return 0.5;
            } else if (x.equals("KV2")) {
                return 1.0;
            } else {
                return 2.5;
            }
        }

        public double getTongDiem() {
            return d1 * 2 + d2 + d3 + getUuTien();
        }

        public void setTrangThai(double x) {
            if (getTongDiem() >= x) {
                trangThai = "TRUNG TUYEN";
            } else {
                trangThai = "TRUOT";
            }
        }

        public String chuanHoaDiem(double x) {
            int q = (int) (x);
            if (q == x) {
                return String.format("%.0f", x);
            } else {
                return String.format("%.1f", x);
            }
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + chuanHoaDiem(getUuTien()) + " " + chuanHoaDiem(getTongDiem()) + " " + trangThai;
        }

    }

    public static void main(String[] args) throws IOException{
        File file=new File("THISINH.in");
        Scanner sc = new Scanner(file);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SV> l = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            l.add(new SV(ma, ten, d1, d2, d3));
        }
        int chiTieu = Integer.parseInt(sc.nextLine());
        Collections.sort(l, new Comparator<DanhSachTrungTuyen.SV>() {
            @Override
            public int compare(SV t, SV t1) {
                if (t.getTongDiem() > t1.getTongDiem()) {
                    return -1;
                } else if (t.getTongDiem() < t1.getTongDiem()) {
                    return 1;
                } else {
                    return t.ma.compareTo(t1.ma);
                }
            }
        });
        double diemChuan = l.get(chiTieu - 1).getTongDiem();
        System.out.printf("%.1f",diemChuan);
        System.out.println("");
        for (SV x : l) {
            x.setTrangThai(diemChuan);
            System.out.println(x);
        }
    }
}
//2
//KV2A002
//Hoang THAnh tuan
//5
//6
//5
//KV3B123
// LY Thi   THU ha
//8
//6.5
//7
//1
