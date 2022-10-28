/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class DuaXeDap {

    static class VDV {

        private String ma, ten, dc, gio;

        public VDV(String ten, String dc, String gio) {
            String res = "";
            String a[] = ten.split("\\s+");
            String b[] = dc.split("\\s+");
            for (int i = 0; i < b.length; i++) {
                res += Character.toUpperCase(b[i].charAt(0));
            }
            for (int i = 0; i < a.length; i++) {
                res += Character.toUpperCase(a[i].charAt(0));
            }
            this.dc = dc;
            this.ten = ten;
            this.gio = gio;
            this.ma=res;
        }

        public double getTB() {
            try {
                SimpleDateFormat f = new SimpleDateFormat("hh:mm");
                Date st = f.parse("6:00");
                Date end = f.parse(gio);
                long startV = st.getTime();
                long endV = end.getTime();
                long tmp = Math.abs(startV - endV);
                long res = tmp / (1000*60);
                return (double) (res / 60.0);
            } catch (Exception e) {
                return 1.0;
            }
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + dc + " " + Math.round(120/getTB()) + " Km/h";
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<VDV> l=new ArrayList<>();
        for(int i=1;i<=t;i++){
            l.add(new VDV(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        l.sort(new Comparator<DuaXeDap.VDV>() {
            @Override
            public int compare(VDV t, VDV t1) {
                return Double.compare(t.getTB(), t1.getTB());
            }
        });
        for(VDV x:l){
            System.out.println(x);
        }
    }
}
//3
//Tran Vu Minh
//Ha Noi
//8:30
//Vu Ngoc Hoang
//Hoa Binh
//8:20
//Pham Dinh Tan
//An Giang
//8:45