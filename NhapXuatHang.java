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
public class NhapXuatHang {
    static class MH{
        private String ma,ten,loai;

        public MH(String ma, String ten, String loai) {
            this.ma = ma;
            this.ten = ten;
            this.loai = loai;
        }
        public double getThue(){
            if(loai.equals("A")){
                return 0.08;
            }
            else if(loai.equals("B")){
                return 0.05;
            }
            else return 0.02;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<MH> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            l.add(new MH(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m=Integer.parseInt(sc.nextLine());
        while(m-->0){
            String s=sc.nextLine();
            String a[]=s.split("\\s+");
            String mas=a[0];
            int sln=Integer.parseInt(a[1]);
            int dgn=Integer.parseInt(a[2]);
            int slx=Integer.parseInt(a[3]);
            for(MH x:l){
                if(x.ma.equals(mas)){
                    System.out.println(x.ma+" "+x.ten+" "+sln*dgn+" "+(int)(slx*dgn*(1+x.getThue())));
                }
            }
        }
    }
}
//2
//A001
//Tu lanh
//A
//P002
//May giat
//B
//2
//A001 500 100 300
//P002 1000 1000 500