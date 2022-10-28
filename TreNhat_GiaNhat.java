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
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class TreNhat_GiaNhat {
    static class Person{
        private String ten,ngaysinh;

        public Person(String ten, String ngaysinh) {
            this.ten = ten;
            this.ngaysinh = ngaysinh;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Person> l = new ArrayList<>();
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            l.add(new Person(sc.next(), sc.next()));
        }
        Collections.sort(l, new Comparator<TreNhat_GiaNhat.Person>() {
            @Override
            public int compare(Person t, Person t1) {
                String a[]=t.ngaysinh.split("/");
                String b[]=t1.ngaysinh.split("/");
                if(!a[2].equals(b[2])){
                    return a[2].compareTo(b[2]);
                }
                else if(!a[1].equals(b[1])){
                    return a[1].compareTo(b[1]);
                }
                    return a[0].compareTo(b[0]);
            }
        });
        System.out.println(l.get(l.size()-1).ten);
        System.out.println(l.get(0).ten);
    }
}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990