/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DuyManh
 */
public class LopInSet2 {
    static class IntSet{
        private TreeSet<Integer> t;

        public IntSet(int a[]) {
            t=new TreeSet<>();
            for(int x:a){
                t.add(x);
            }
        }
        public IntSet(){
            t=new TreeSet<>();
        }
        public IntSet intersection(IntSet s2){
            IntSet s3=new IntSet();
            for(int x:s2.t){
                if(this.t.contains(x)){
                    s3.t.add(x);
                }
            }
            return s3;
        }

        @Override
        public String toString() {
            String res="";
            for(int x:this.t){
                res+=x+"";
                res+=" ";
            }
            res=res.trim();
            return res;
        }
        
    }
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(new File("DATA.in"));
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
