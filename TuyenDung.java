/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class TuyenDung {
    static class NV{
        private String ma,ten;
        private double d1,d2;

        public NV() {
        }

        public NV(int ma,String ten, double d1, double d2) {
            this.ma="TS"+String.format("%02d", ma);
            this.ten = ten;
            this.d1 = d1;
            this.d2 = d2;
            setD1(d1);
            setD2(d2);
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public void setD1(double d1) {
            if(d1==10){
                this.d1=10;
            }
            else if(d1<10){
                this.d1=d1;
            }
            else{
                this.d1=d1/10;
            }
        }

        public void setD2(double d2) {
            if(d2==10){
                this.d2=10;
            }
            else if(d2<10){
                this.d2=d2;
            }
            else{
                this.d2=d2/10;
            }
        }
        public double getTB(){
            return (d1+d2)/2;
        }
        public String getTT(){
            if(getTB()<5){
                return "TRUOT";
            }
            else if(getTB()<8){
                return "CAN NHAC";
            }
            else if(getTB()<9.5){
                return "DAT";
            }
            else return "XUAT SAC";
        }
        @Override
        public String toString() {
            return ma+" "+ten+" "+String.format("%.2f", getTB())+" "+getTT();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<NV> l=new ArrayList<>();
        for(int i=1;i<=t;i++){
            l.add(new NV(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        l.sort(new Comparator<TuyenDung.NV>() {
            @Override
            public int compare(NV t, NV t1) {
                return Double.compare(t1.getTB(), t.getTB());
            }
        });
        for(NV x:l){
            System.out.println(x);
        }
    }
}
//3
//Nguyen Thai Binh
//45
//75
//Le Cong Hoa
//4
//4.5
//Phan Van Duc
//56
//56