/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class BangXepHang {
    static class SV{
        private String ten;
        private int sub,sumSub;

        public SV(String ten, int sub, int sumSub) {
            this.ten = ten;
            this.sub = sub;
            this.sumSub = sumSub;
        }

        @Override
        public String toString() {
            return ten+" "+sub+" "+sumSub;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<SV> l =new ArrayList<>();
        while(t-->0){
            String ten=sc.nextLine();
            int sub=sc.nextInt();
            int sumsub=sc.nextInt();
            sc.nextLine();
            SV x=new SV(ten, sub, sumsub);
            l.add(x);
        }
        Collections.sort(l,new Comparator<BangXepHang.SV>() {
            @Override
            public int compare(SV t, SV t1) {
                if(t.sub!=t1.sub){
                    return t1.sub-t.sub;
                }
                return t.sumSub-t1.sumSub;
            }
        });
        for(SV x:l){
            System.out.println(x);
        }
    }
}
