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
public class TimKiemGiangVien {
    static class GV{
        private String ma,ten,khoa;

        public GV(int ma, String ten, String khoa) {
            this.ma = "GV"+String.format("%02d", ma);
            this.ten = ten;
            this.khoa = khoa;
        }
        public String getVietTatMa(){
            String x=khoa;
            x=x.toUpperCase();
            String a[]=x.split("\\s+");
            String res="";
            for(String z:a){
                res+=z.charAt(0);
            }
            return res;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+getVietTatMa();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<GV> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String khoa=sc.nextLine();
            l.add(new GV(i, ten, khoa));
        }
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String tv=sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+tv+":");
            String TV=tv.toLowerCase();
            for(GV x:l){
                String a=x.ten;
                a=a.toLowerCase();
                if(a.contains(TV)){
                    System.out.println(x);
                }
            }
        }
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//aN