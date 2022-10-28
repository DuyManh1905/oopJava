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
public class DanhSachCaThi {
    static class Thi{
        private String ma,ngay,gio,phong;

        public Thi(int ma, String ngay, String gio, String phong) {
            this.ma = "C"+String.format("%03d", ma);
            this.ngay = ngay;
            this.gio = gio;
            this.phong = phong;
        }

        @Override
        public String toString() {
            return ma+" "+ngay+" "+gio+" "+phong;
        }
        
    }
    public static void main(String[] args) throws IOException{
        File file=new File("CATHI.in");
        Scanner sc=new Scanner(file);
        ArrayList<Thi> l =new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ngay=sc.nextLine();
            String gio=sc.nextLine();
            String phong=sc.nextLine();
            l.add(new Thi(i, ngay, gio, phong));
        }
        Collections.sort(l,new Comparator<DanhSachCaThi.Thi>() {
            @Override
            public int compare(Thi t, Thi t1) {
                String ngay1=t.ngay,ngay2=t1.ngay;
                String gio1=t.gio,gio2=t1.gio;
                if(!ngay1.equals(ngay2)){
                    int nam1=Integer.parseInt(ngay1.substring(6,10));
                    int thang1=Integer.parseInt(ngay1.substring(3,5));
                    int nga1=Integer.parseInt(ngay1.substring(0,2));
                    
                    int nam2=Integer.parseInt(ngay2.substring(6,10));
                    int thang2=Integer.parseInt(ngay2.substring(3,5));
                    int nga2=Integer.parseInt(ngay2.substring(0,2));
                    if(nam1!=nam2) return nam1-nam2;
                    else if(thang1!=thang2) return thang1-thang2;
                    else return nga1-nga2;
                }
                else if(gio1!=gio2){
                    int hour1=Integer.parseInt(gio1.substring(0,2));
                    int phut1=Integer.parseInt(gio1.substring(3,5));
                    
                    int hour2=Integer.parseInt(gio2.substring(0,2));
                    int phut2=Integer.parseInt(gio2.substring(3,5));
                    if(hour1!=hour2){
                        return hour1-hour2;
                    }
                    else return phut1-phut2;
                }
                else return t.ma.compareTo(t1.ma);
            }
        });
        for(Thi x:l){
            System.out.println(x);
        }
    }
}
