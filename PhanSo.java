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
public class PhanSo {
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
            toiGian();
        }

        @Override
        public String toString() {
            return tu+"/"+mau;
        }
        public void toiGian(){
            long x=gcd(tu,mau);
            tu/=x;
            mau/=x;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(),b=sc.nextLong();
        ps x=new ps(a, b);
        System.out.println(x);
    }
}
