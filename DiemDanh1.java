/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class DiemDanh1 {
    static class DD{
        private String ma,ten,lop;
        private int d;

        public DD(String ma, String ten, String lop) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
        }
        public int getDiem(String z){
            int x=0,m=0,v=0;
            for(int i=0;i<z.length();i++){
                if(z.charAt(i)=='x'){
                    x++;
                }
                else if(z.charAt(i)=='v'){
                    v++;
                }
                else m++;
            }
            int dd=10-(m*1+v*2);
            if(dd<0){
                return 0;
            }
            return dd;
        }
        @Override
        public String toString() {
            return ma+" "+ten+" "+lop;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<DD> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            l.add(new DD(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(int i=1;i<=t;i++){
            String dd=sc.nextLine();
            String a[]=dd.split("\\s+");
            String madd=a[0];
            String xm=a[1];
            for(DD x:l){
                if(x.ma.equals(madd)){
                    x.d=x.getDiem(xm);
                }
            }
        }
        for(DD x:l){
            if(x.d==0){
                System.out.print(x+" "+x.d+" ");
                System.out.println("KDDK");
            }
            else System.out.println(x+" "+x.d+" ");
        }
    }
}
//3
//B19DCCN999
//Le Cong Minh
//D19CQAT02-B
//B19DCCN998
//Tran Truong Giang
//D19CQAT02-B
//B19DCCN997
//Nguyen Tuan Anh
//D19CQCN04-B
//B19DCCN998 xxxmxmmvmx
//B19DCCN997 xmxmxxxvxx
//B19DCCN999 xvxmxmmvvm