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
public class LietKeNhapXuatHangTheoNhom {
    static class Hang{
        private String ma;
        private int sl;

        public Hang(String ma, int sl) {
            this.ma = ma;
            this.sl = sl;
        }
        public int getXuat(){
            if(ma.charAt(0)=='A'){
                return (int)Math.round(60*sl/100.0);
            }
            else return (int)Math.round(70*sl/100.0);
        }
        public int getDonGia(){
            if(ma.charAt(ma.length()-1)=='Y'){
                return 110000;
            }
            else return  135000;
        }
        public int getTien(){
            return getDonGia()*getXuat();
        }
        public int getThue(){
            char d=ma.charAt(0);
            char c=ma.charAt(ma.length()-1);
            if(d=='A' && c=='Y'){
                return (int)(getTien()*0.08);
            }
            else if(d=='A' && c=='N'){
                return (int)(getTien()*0.11);
            }
            else if(d=='B' && c=='Y'){
                return (int)(getTien()*0.17);
            }
            else return (int)(getTien()*0.22);
        }

        @Override
        public String toString() {
            return ma+" "+sl+" "+getXuat()+" "+getDonGia()+" "+getTien()+" "+getThue();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Hang> l = new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ma=sc.nextLine();
            int sl=Integer.parseInt(sc.nextLine());
            l.add(new Hang(ma, sl));
        }
        Collections.sort(l,new Comparator<LietKeNhapXuatHangTheoNhom.Hang>() {
            @Override
            public int compare(Hang t, Hang t1) {
                return t1.getThue()-t.getThue();
            }
        });
        char q=sc.nextLine().charAt(0);
        for(Hang x:l){
            if(x.ma.charAt(0)==q){
                System.out.println(x);
            }
        }
    }
}
//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582
//B