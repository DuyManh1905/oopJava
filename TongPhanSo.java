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
public class TongPhanSo {
    public static long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    static class ps{
        private long tu,mau;

        public ps(long tu, long mau) {
            this.tu = tu;
            this.mau = mau;
            rutGon();
        }

        @Override
        public String toString() {
            return tu+"/"+mau;
        }
        
        public void rutGon(){
            long x=gcd(tu,mau);
            tu/=x;
            mau/=x;
        }
        public ps sum(ps p1,ps p2){
            ps res=new ps();
            res.tu=p1.tu*p2.mau +p2.tu*p1.mau;
            res.mau=p1.mau*p2.mau;
            res.rutGon();
            return res;
        }

        public ps() {
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x1=sc.nextLong(),x2=sc.nextLong(),y1=sc.nextLong(),y2=sc.nextLong();
        ps p1=new ps(x1, x2);
        ps p2=new ps(y1, y2);
        System.out.println(p1.sum(p1, p2));
    }
}
