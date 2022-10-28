/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class TinhTienDien2 {
    static class Dien{
        private String LoaiSD,ma;
        private int soCu,soMoi;

        public Dien(String LoaiSD, int ma, int soCu, int soMoi) {
            this.LoaiSD = LoaiSD;
            this.ma = "KH"+String.format("%02d",ma);
            this.soCu = soCu;
            this.soMoi = soMoi;
        }
        public int getHeSo(){
            if(LoaiSD.equals("KD")){
                return 3;
            }
            else if(LoaiSD.equals("NN")){
                return 5;
            }
            else if(LoaiSD.equals("TT")){
                return 4;
            }
            else return 2;
        }
        public int getThanhTien(){
            return (soMoi-soCu)*550*getHeSo();
        }
        public int getPhuTroi(){
            int x=soMoi-soCu;
            if(x<50){
                return 0;
            }
            else if(x<=100){
                return (int)Math.round(35*getThanhTien()/100.0);
            }
            else return getThanhTien();
        }
        public int getTongTien(){
            return getPhuTroi()+getThanhTien();
        }

        @Override
        public String toString() {
            return ma+" "+getHeSo()+" "+getThanhTien()+" "+getPhuTroi()+" "+getTongTien();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Dien> l =new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String loai=sc.nextLine();
            int sd=Integer.parseInt(sc.nextLine());
            int scuoi=Integer.parseInt(sc.nextLine());
            l.add(new Dien(loai, i, sd, scuoi));
        }
//        Collections.sort(l,new Comparator<SapXepBangTinhTienDien.Dien>() {
//            @Override
//            public int compare(Dien t, Dien t1) {
//                return t1.getTongTien()-t.getTongTien();
//            }
//        });
        for(Dien x:l){
            System.out.println(x);
        }
    }
}
//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700