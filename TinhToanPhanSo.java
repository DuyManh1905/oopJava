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
public class TinhToanPhanSo {
    public static long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    static class PS{
        private long tu,mau;

        public PS(long tu, long mau) {
            this.tu = tu;
            this.mau = mau;
        }

        public PS() {
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
        public PS cong(PS moi){
            PS res=new PS();
            res.tu=this.tu*moi.mau+this.mau*moi.tu;
            res.mau=this.mau*moi.mau;
            res.rutGon();
            return res;
        }
        public PS nhan(PS moi){
            PS res=new PS();
            res.tu=this.tu*moi.tu;
            res.mau=this.mau*moi.mau;
            res.rutGon();
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong();
            PS x=new PS(a, b);
            PS y=new PS(c, d);
            PS s1=new PS();
            PS s2=new PS();
            s1= (x.cong(y)).nhan(x.cong(y));
            s2=x.nhan(y).nhan(s1);
            System.out.println(s1+" "+s2);
        }
    }
}
