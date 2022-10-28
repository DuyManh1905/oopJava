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
public class WordSet {
    private TreeSet<String> t;

    public WordSet(String s) {
        s=s.toLowerCase();
        s=s.trim();
        String a[]=s.split("\\s+");
        t=new TreeSet<>();
        for(String x:a){
            t.add(x);
        }
    }

    public WordSet() {
    }
    
    public WordSet union(WordSet moi){
        WordSet res=new WordSet();
        res.t = new TreeSet<>();
        for(String x:t){
            res.t.add(x);
        }
        for(String x:moi.t){
            res.t.add(x);
        }
        return res;
    }
    public WordSet intersection(WordSet moi){
        WordSet res=new WordSet();
        res.t=new TreeSet<>();
        for(String x:moi.t){
            if(t.contains(x)){
                res.t.add(x);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String res="";
        for(String x:t){
            res+=x;
            res+=" ";
        }
        res=res.trim();
        return res;
    }
    
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
//Lap trinh huong doi tuong
//Ngon ngu lap trinh C++