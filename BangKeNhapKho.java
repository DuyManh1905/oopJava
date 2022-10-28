/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author DuyManh
 */
public class BangKeNhapKho {
    static class SP{
        private String ma,ten;
        private int sl,donGia;

        public SP(String ma,String ten, int sl, int donGia) {
            this.ma=ma;
            this.ten = ten;
            this.sl = sl;
            this.donGia = donGia;
        }
        public int getPhanTramChietKhau(){
            if(sl>10){
                return 5;
            }
            else if(sl>=8){
                return 2;
            }
            else if(sl>=5){
                return 1;
            }
            else return 0;
        }
        public int getChietKhau(){
            return (int)(donGia*sl*getPhanTramChietKhau()/100.0);
        }
        public int getThanhTien(){
            return donGia*sl-getChietKhau();
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+getChietKhau()+" "+getThanhTien();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        Map<String,Integer> m =new TreeMap<>();
        int cnt=1;
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            int sl=Integer.parseInt(sc.nextLine());
            int gia=Integer.parseInt(sc.nextLine());
            String a[]=ten.split("\\s+");
            String res="";
            for(int k=0;k<2;k++){
                res+=Character.toUpperCase(a[k].charAt(0));
            }
            if(m.containsKey(res)){
                int pre=m.get(res);
                pre+=1;
                m.put(res, pre);
            }
            else{
                m.put(res, 1);
            }
            String ma= res+String.format("%02d", m.get(res));
            SP x=new SP(ma, ten, sl, gia);
            System.out.println(x);
        }
    }
}
//3
//May lanh SANYO
//12
//4000000
//Dien thoai Samsung
//30
//3230000
//Dien thoai Nokia
//18
//1240000