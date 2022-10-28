/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class XepHangVanDongVien1 {
    static class VDV{
        private String ma,ten,ngaySinh,timeStart,timeEnd;
        private int thuHang;
        public VDV(int ma,String ten, String ngaySinh, String timeStart, String timeEnd) {
            this.ma = "VDV"+String.format("%02d", ma);
            this.ten = ten;
            this.ngaySinh = ngaySinh;
            this.timeStart = timeStart;
            this.timeEnd = timeEnd;
        }
        public int getTuoi(){
            String x=ngaySinh.substring(6,10);
            int a=Integer.parseInt(x);
            return 2021-a;
        }
        public int getUuTien(){
            if(getTuoi()<18){
                return 0;
            }
            else if(getTuoi()<25){
                return 1;
            }
            else if(getTuoi()<32){
                return  2;
            }
            else return 3;
        }
        public int getTime(){
            SimpleDateFormat sf= new SimpleDateFormat("hh:mm:ss");
            String x=timeStart;
            String y=timeEnd;
            try{
                Date start = sf.parse(x);
                Date end = sf.parse(y);
                long startV=start.getTime();
                long endV=end.getTime();
                long tmp=Math.abs(startV-endV);
                long res= tmp/(1000);
                return (int)res;
            }catch(ParseException e){
                e.printStackTrace();
            }
            return -1;
        }
        public String inTime(int secs){
            return String.format("%02d:%02d:%02d", secs / 3600, (secs % 3600) / 60, (secs % 60));
        }
        public int getThanhTich(){
            return getTime()-getUuTien();
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+inTime(getTime())+" "+inTime(getUuTien())+" "+inTime(getTime()-getUuTien());
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<VDV> l = new ArrayList<>();
        ArrayList<VDV> l1 = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String ngay=sc.nextLine();
            String start=sc.nextLine();
            String end=sc.nextLine();
            l.add(new VDV(i, ten, ngay, start, end));
            l1.add(new VDV(i, ten, ngay, start, end));
        }
        Collections.sort(l, new Comparator<XepHangVanDongVien1.VDV>() {
            @Override
            public int compare(VDV t, VDV t1) {
                return t.getThanhTich()-t1.getThanhTich();
            }
        });
        int cnt=1;
        int dem=1;
        l.get(0).thuHang=1;
        for(int i=0;i<l.size()-1;i++){
            dem++;
            if(l.get(i).getThanhTich()==l.get(i+1).getThanhTich()){
                l.get(i+1).thuHang=cnt;
            }
            else{
                cnt=dem;
                l.get(i+1).thuHang=cnt;
            }
        }
        for(VDV x:l1){
            for(VDV y:l){
                if(x.ma.equals(y.ma)){
                    System.out.println(y+" "+y.thuHang);
                }
            }
        }
    }
}
//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30