/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class KetQuaXetTuyen {
    static class PH{
        private String ma,ten,ngaySinh;
        private double d1,d2;

        public PH(int ma, String ten, String ngaySinh, double d1, double d2) {
            this.ma = "PH"+String.format("%02d", ma);
            this.ten = ten;
            this.ngaySinh = ngaySinh;
            this.d1 = d1;
            this.d2 = d2;
        }
        public double getUuTien(){
            if(d1>=8 && d2>=8){
                return 1.0;
            }
            else if(d1>=7.5 && d2>=7.5){
                return 0.5;
            }
            else return 0;
        }
        public int getTongDiem(){
            int x = (int)(Math.round((d1+d2)/2.0)+getUuTien());
            if(x>=10){
                return 10;
            }
            return x;
        }
        public int getTuoi(){
            String x=ngaySinh.substring(6,10);
            return 2021-Integer.parseInt(x);
        }
        public String getDanhHieu(){
            if(getTongDiem()<5){
                return "Truot";
            }
            else if(getTongDiem()<=6){
                return "Trung binh";
            }
            else if(getTongDiem()<=7){
                return "Kha";
            }
            else if(getTongDiem()<=8){
                return "Gioi";
            }
            else return "Xuat sac";
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+getTuoi()+" "+getTongDiem()+" "+getDanhHieu();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            PH x=new PH(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            System.out.println(x);
        }
    }
}
//3
//Doan Thi Kim
//13/03/1982
//8
//9.5
//Dinh Thi Ngoc Ha
//03/09/1996
//6.5
//8
//Tran Thanh Mai
//12/09/2004
//8
//9