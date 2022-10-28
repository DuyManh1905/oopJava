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
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class SapXepThoiGian {
    static class Time{
        private int gio,phut,giay;

        public Time(int gio, int phut, int giay) {
            this.gio = gio;
            this.phut = phut;
            this.giay = giay;
        }

        @Override
        public String toString() {
            return gio+" "+phut+" "+giay;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Time> l =new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            Time tmp=new Time(a, b, c);
            l.add(tmp);
        }
        Collections.sort(l, new Comparator<Time>() {
            @Override
            public int compare(Time t, Time t1) {
                if(t.gio!=t1.gio){
                    return t.gio-t1.gio;
                }
                else if(t.phut!=t1.phut){
                    return t.phut-t1.phut;
                }
                else{
                    return t.giay-t1.giay;
                }
            }
        });
        for(Time x:l){
            System.out.println(x);
        }
    }
}
