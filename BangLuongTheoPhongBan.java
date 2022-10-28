/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DuyManh
 */
public class BangLuongTheoPhongBan {

    static class NV {

        private String ma, ten;
        private int luongCB, snc;

        public NV(String ma, String ten, int luongCB, int snc) {
            this.ma = ma;
            this.ten = ten;
            this.luongCB = luongCB;
            this.snc = snc;
        }

        public char getNhom() {
            return ma.charAt(0);
        }

        public int getSoNam() {
            String x = ma.substring(1, 3);
            return Integer.parseInt(x);
        }

        public String getMaPhong() {
            String x = ma.substring(3);
            return x;
        }

        public int getLuong() {
            int luong = snc * luongCB * getHeSo() * 1000;
            return luong;
        }

        public int getHeSo() {
            if (getNhom() == 'A') {
                if (getSoNam() <= 3) {
                    return 10;
                } else if (getSoNam() <= 8) {
                    return 12;
                } else if (getSoNam() <= 15) {
                    return 14;
                } else {
                    return 20;
                }
            } else if (getNhom() == 'B') {
                if (getSoNam() <= 3) {
                    return 10;
                } else if (getSoNam() <= 8) {
                    return 11;
                } else if (getSoNam() <= 15) {
                    return 13;
                } else {
                    return 16;
                }
            } else if (getNhom() == 'C') {
                if (getSoNam() <= 3) {
                    return 9;
                } else if (getSoNam() <= 8) {
                    return 10;
                } else if (getSoNam() <= 15) {
                    return 12;
                } else {
                    return 14;
                }
            } else {
                if (getSoNam() <= 3) {
                    return 8;
                } else if (getSoNam() <= 8) {
                    return 9;
                } else if (getSoNam() <= 15) {
                    return 11;
                } else {
                    return 13;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = Integer.parseInt(sc.nextLine());
        HashMap<String, String> mp = new HashMap<>();
        for (int i = 1; i <= y; i++) {
            String s = sc.nextLine();
            String a[] = s.split("\\s+");
            String maP = a[0];
            String tenP = "";
            for (int j = 1; j < a.length; j++) {
                tenP += a[j];
                tenP += " ";
            }
            tenP = tenP.trim();
            mp.put(maP, tenP);
        }
        int t = Integer.parseInt(sc.nextLine());
        List<NV> l = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            NV x = new NV(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            l.add(x);
        }
        String q = sc.nextLine();
        Set<Map.Entry<String, String>> entry = mp.entrySet();
        for (Map.Entry<String, String> e : entry) {
            if (q.equals(e.getKey())) {
                System.out.println("Bang luong phong "+e.getValue()+":");
                break;
            }
        }
        for(NV x:l){
            if(x.getMaPhong().equals(q)){
                System.out.println(x.ma+" "+x.ten+" "+x.getLuong());
            }
        }
    }
}
//2
//HC Hanh chinh
//KH Ke hoach Dau tu
//2
//C06HC
//Tran Binh Minh
//65
//25
//D03KH
//Le Hoa Binh
//59
//24
