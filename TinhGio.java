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
public class TinhGio {
    static class Net{
        private String ma,ten,gioVao,gioRa;

        public Net(String ma, String ten, String gioVao, String gioRa) {
            this.ma = ma;
            this.ten = ten;
            this.gioVao = gioVao;
            this.gioRa = gioRa;
        }
        public String getTime(){
            String x=gioVao;
            String y=gioRa;
            int gio1=Integer.parseInt(x.substring(0, 2));
            int phut1=Integer.parseInt(x.substring(3,5));
            int time1=gio1*60+phut1;
            
            int gio2=Integer.parseInt(y.substring(0, 2));
            int phut2=Integer.parseInt(y.substring(3,5));
            int time2=gio2*60+phut2;
            
            int lech=time2-time1;
            return (lech/60)+" gio "+(lech%60)+" phut";
        }
        public int getGio(){
            String x=gioVao;
            String y=gioRa;
            int gio1=Integer.parseInt(x.substring(0, 2));
            int phut1=Integer.parseInt(x.substring(3,5));
            int time1=gio1*60+phut1;
            
            int gio2=Integer.parseInt(y.substring(0, 2));
            int phut2=Integer.parseInt(y.substring(3,5));
            int time2=gio2*60+phut2;
            
            int lech=time2-time1;
            return lech;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+getTime();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Net> l = new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String gv=sc.nextLine();
            String gr=sc.nextLine();
            l.add(new Net(ma, ten, gv, gr));
        }
        Collections.sort(l, new Comparator<TinhGio.Net>() {
            @Override
            public int compare(Net t, Net t1) {
                return t1.getGio()-t.getGio();
            }
        });
        for(Net x:l){
            System.out.println(x);
        }
    }
}

//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00