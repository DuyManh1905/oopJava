/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class TinhThuNhapChoGiaoVien {

    static class NV {

        private String ma, ten, chucVu;
        private int luongCB, snc;

        public NV(int ma, String ten, String chucVu, int luongCB, int snc) {
            this.ma = "NV" + String.format("%02d", ma);
            this.ten = ten;
            this.chucVu = chucVu;
            this.luongCB = luongCB;
            this.snc = snc;
        }

        public int getPhuCap() {
            if (chucVu.equals("GD")) {
                return 500;
            } else if (chucVu.equals("PGD")) {
                return 400;
            } else if (chucVu.equals("TP")) {
                return 300;
            } else if (chucVu.equals("KT")) {
                return 250;
            } else {
                return 100;
            }
        }

        public int getTamUng() {
            if (((getPhuCap() + luongCB*snc) * 2) / 3 < 25000) {
                return (int) Math.round((getPhuCap() + luongCB*snc) * 2.0 / 3.0/1000.0)*1000;
            } else {
                return 25000;
            }
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + getPhuCap() + " " + luongCB*snc + " " + getTamUng() + " " + (luongCB*snc - getTamUng() + getPhuCap());

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            NV x = new NV(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            System.out.println(x);
        }
    }
}
//4
//Tran Thi Yen
//NV
//1000
//24
//Nguyen Van Thanh
//BV
//1000
//30
//Doan Truong An
//TP
//3000
//25
//Le Thanh
//GD
//5000
//28