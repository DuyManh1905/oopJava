/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class DanhSachSinhVienTrongFile2 {
    static class SV{
        private String ma,ten,lop,ngay;
        private double gpa;

        public SV(int ma,String ten, String lop, String ngay, double gpa) {
            this.ma="B20DCCN"+String.format("%03d",ma);
            this.ten = ten;
            this.lop = lop;
            this.ngay = ngay;
            this.gpa = gpa;
            chuanHoa();
        }
        public void chuanHoa(){
            StringBuilder s=new StringBuilder(ngay);
            if(s.charAt(1)=='/'){
                s=s.insert(0, "0");
            }
            if(s.charAt(4)=='/'){
                s=s.insert(3, "0");
            }
            ngay=s.toString();
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+lop+" "+ngay+" "+String.format("%.2f", gpa);
        }
        
    }
    public static void main(String[] args) throws IOException{
        File f =new File("SV.in");
        Scanner sc=new Scanner(f);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SV> l = new ArrayList<>();
        for(int i=0;i<t;i++){
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String ngay=sc.nextLine();
            double gpa=Double.parseDouble(sc.nextLine());
            l.add(new SV(i+1, ten, lop, ngay, gpa));
        }
        for(SV x:l){
            System.out.println(x);
        }
    }
}
