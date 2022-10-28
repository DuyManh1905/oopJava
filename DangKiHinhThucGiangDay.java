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
public class DangKiHinhThucGiangDay {
    static class GV{
        private String ma,ten,lyThuyet,thucHanh;
        private int soTin;

        public GV(String ma, String ten,int soTin, String lyThuyet, String thucHanh) {
            this.ma = ma;
            this.ten = ten;
            this.lyThuyet = lyThuyet;
            this.thucHanh = thucHanh;
            this.soTin = soTin;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+soTin+" "+lyThuyet+" "+thucHanh;
        }
        
    }
    public static void main(String[] args) throws IOException{
        File file =new File("MONHOC.in");
        Scanner sc=new Scanner(file);
        ArrayList<GV> l = new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int st=Integer.parseInt(sc.nextLine());
            String lythuyet=sc.nextLine();
            String thuchanh=sc.nextLine();
            l.add(new GV(ma, ten, st, lythuyet, thuchanh));
        }
        Collections.sort(l, new Comparator<DangKiHinhThucGiangDay.GV>() {
            @Override
            public int compare(GV t, GV t1) {
                return t.ma.compareTo(t1.ma);
            }
        });
        for(GV x:l){
            if(x.thucHanh.equals("Truc tuyen") || x.thucHanh.contains(".ptit.edu.vn")){
                System.out.println(x);
            }
        }
    }
}
//3
//INT1306
//Cau truc du lieu va giai thuat
//3
//Truc tiep
//code.ptit.edu.vn
//INT13110
//Lap trinh mang voi C++
//3
//Truc tiep
//Truc tuyen
//INT1155
//Tin hoc co so 2
//2
//Truc tiep
//code.ptit.edu.vn