/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class QuanLyBaiTapNhom1 {
    static class BT{
        private String ma,ten,sdt;
        private int stt;

        public BT(String ma, String ten, String sdt, int stt) {
            this.ma = ma;
            this.ten = ten;
            this.sdt = sdt;
            this.stt = stt;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+sdt;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        ArrayList<BT> l = new ArrayList<>();
        ArrayList<String> l1=new ArrayList<>();
        for(int i=1;i<=n;i++){
            l.add(new BT(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        for(int i=1;i<=m;i++){
            l1.add(sc.nextLine());
        }
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            int tv=sc.nextInt();
            System.out.println("DANH SACH NHOM "+tv+":");
            for(BT x:l){
                if(x.stt==tv){
                    System.out.println(x);
                }
            }
            System.out.println("Bai tap dang ky: "+l1.get(tv-1));
        }
    }
}
//5 2
//B17DTCN001
//Nguyen Chi  Linh
//0987345543
//1
//B17DTCN011
//Vu Viet Thang
//0981234567
//1
//B17DTCN023
//Pham Trong Thang
//0992123456
//1
//B17DTCN022
//Nguyen Van  Quyet
//0977865432
//2
//B17DTCN031
//Ngo Thanh Vien
//0912313111
//2
//Xay dung website ban dien thoai truc tuyen
//Xay dung ung dung quan ly benh nhan Covid-19
//1
//1