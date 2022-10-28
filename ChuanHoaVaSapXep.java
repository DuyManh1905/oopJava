/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class ChuanHoaVaSapXep {
    public static void main(String[] args) throws IOException{
        File file = new File("DANHSACH.in");
        Scanner sc=new Scanner(file);
        ArrayList<String> l =new ArrayList<>();
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            s=s.trim();
            s=s.toLowerCase();
            String a[]=s.split("\\s+");
            String res="";
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length();j++){
                    if(j==0){
                        res+=Character.toUpperCase(a[i].charAt(0));
                    }
                    else{
                        res+=a[i].charAt(j);
                    }
                }
                res+=" ";
            }
            res=res.trim();
            l.add(res);
        }
        Collections.sort(l,new Comparator<String>() {
            @Override
            public int compare(String t, String t1) {
                String a[] = t.split("\\s+");
                String b[] = t1.split("\\s+");
                if (!a[a.length - 1] .equals(b[b.length-1])) {
                    return a[a.length - 1].compareTo(b[b.length - 1]);
                }
                return t.compareTo(t1);
            }
        });
        for(String z:l){
            System.out.println(z);
        }
    }
}
//  nguyEn    ManH   son
// ngo MINH                 tuAn
//         nguyen manh hung
//TRAN TRUNG DUNG