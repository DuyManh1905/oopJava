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
public class DanhSachDoiTuongNhanVien {
    static class NV{
        private String ma,ten,gt,ngaySinh,diaChi,mst,ngayKi;

        public NV(int ma, String ten, String gt, String ngaySinh, String diaChi, String mst, String ngayKi) {
            this.ma = String.format("%05d", ma);
            this.ten = ten;
            this.gt = gt;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
            this.mst = mst;
            this.ngayKi = ngayKi;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+gt+" "+ngaySinh+" "+diaChi+" "+mst+" "+ngayKi;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String gt=sc.nextLine();
            String ngay1=sc.nextLine();
            String dc=sc.nextLine();
            String mst=sc.nextLine();
            String ngay2=sc.nextLine();
            NV x = new NV(i, ten, gt, ngay1, dc, mst, ngay2);
            System.out.println(x);
            
        }
    }
}

//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011
