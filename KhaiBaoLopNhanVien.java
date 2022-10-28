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
public class KhaiBaoLopNhanVien {
    static class NhanVien{
        private String ma,ten,gioiTinh,ngaySinh,diaChi,mst,ngayKi;

        public NhanVien(String ten, String gioiTinh, String ngaySinh, String diaChi, String mst, String ngayKi) {
            this.ma="00001";
            this.ten = ten;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
            this.mst = mst;
            this.ngayKi = ngayKi;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+gioiTinh+" "+ngaySinh+" "+diaChi+" "+mst+" "+ngayKi;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ten=sc.nextLine();
        String gt=sc.next();
        String ngay1=sc.next();
        sc.nextLine();
        String dc=sc.nextLine();
        String mst=sc.next();
        String ngay2=sc.next();
        NhanVien a=new NhanVien(ten, gt, ngay1, dc, mst, ngay2);
        System.out.println(a);
    }
}
