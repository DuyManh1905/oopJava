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
public class TinhTienDien {
    static class Khach{
        private String ma,ten,loaiHo;
        private int soDau,soCuoi;

        public Khach(int ma, String ten, String loaiHo, int soDau, int soCuoi) {
            this.ma = "KH"+String.format("%02d", ma);
            this.ten = ten;
            this.loaiHo = loaiHo;
            this.soDau = soDau;
            this.soCuoi = soCuoi;
            chuanHoaTen();
        }
        public void chuanHoaTen(){
            String s=ten;
            s=s.trim();
            s=s.toLowerCase();
            String a[]=s.split("\\s+");
            String res="";
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length();j++){
                    if(j==0){
                        res+=Character.toUpperCase(a[i].charAt(j));
                    }
                    else{
                        res+=a[i].charAt(j);
                    }
                }
                res+=" ";
            }
            res=res.trim();
            ten=res;
        }
        public int getDinhMuc(){
            if(loaiHo.equals("A")){
                return 100;
            }
            else if(loaiHo.equals("B")){
                return 500;
            }
            else return 200;
        }
        public int tienTrongDM(){
            if(soCuoi-soDau<getDinhMuc()){
                return (soCuoi-soDau)*450;
            }
            else{
                return getDinhMuc()*450;
            }
        }
        public int tienNgoaiDM(){
            if(soCuoi-soDau>getDinhMuc()){
                return (soCuoi-soDau-getDinhMuc())*1000;
            }
            else{
                return 0;
            }
        }
        public int getSoTien(){
            return tienTrongDM()+tienNgoaiDM()+(int)(tienNgoaiDM()*0.05);
        }
        public int getThue(){
            return (int)(tienNgoaiDM()*0.05);
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+tienTrongDM()+" "+tienNgoaiDM()+" "+getThue()+" "+getSoTien();
        }
        
    }
    public static void main(String[] args) throws IOException{
        File file=new File("KHACHHANG.in");
        Scanner sc=new Scanner(file);
        ArrayList<Khach> l = new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String loai=sc.next();
            int sodau=sc.nextInt();
            int socuoi=sc.nextInt();
            sc.nextLine();
            l.add(new Khach(i, ten, loai, sodau, socuoi));
        }
        Collections.sort(l, new Comparator<TinhTienDien.Khach>() {
            @Override
            public int compare(Khach t, Khach t1) {
                return t1.getSoTien()-t.getSoTien();
            }
        });
        for(Khach x:l){
            System.out.println(x);
        }
    }
}
//2
// nGuyEn Hong Ngat
//C 200 278
// Chu thi    minh
//A 120 160