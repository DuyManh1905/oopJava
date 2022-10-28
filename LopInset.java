/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DuyManh
 */
public class LopInset {
    static class IntSet{
        TreeSet<Integer> t;

        public IntSet(int[] a) {
            t=new TreeSet<>();
            for(int x:a){
                t.add(x);
            }
        }

        public IntSet() {
        }
        
        public IntSet union(IntSet moi){
            IntSet res=new IntSet();
            res.t=new TreeSet<>();
            for(int x:t){
                res.t.add(x);
            }
            for(int y:moi.t){
                res.t.add(y);
            }
            return res;
        }
        @Override
        public String toString() {
            String res="";
            for(int x:t){
                res+=x;
                res+=" ";
            }
            res=res.trim();
            return res;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
