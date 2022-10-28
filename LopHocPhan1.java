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
public class LopHocPhan1 {
    private String ma,ten,nhom,tenGV;

    public LopHocPhan1(String ma, String ten, String nhom, String tenGV) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.tenGV = tenGV;
    }

    @Override
    public String toString() {
        return nhom+" "+tenGV;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<LopHocPhan1> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            l.add(new LopHocPhan1(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(l,new Comparator<LopHocPhan1>() {
            @Override
            public int compare(LopHocPhan1 t, LopHocPhan1 t1) {
                return t.nhom.compareTo(t1.nhom);
            }
        });
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String tv=sc.nextLine();
            System.out.print("Danh sach nhom lop mon ");
            for(LopHocPhan1 x:l){
                if(x.ma.equals(tv)){
                    System.out.println(x.ten+":");
                    break;
                }
            }
            for(LopHocPhan1 x:l){
                if(x.ma.equals(tv)){
                    System.out.println(x);
                }
            }
        }
    }
    
}
//4
//THCS2D20
//Tin hoc co so 2 - D20
//01
//Nguyen Binh An
//CPPD20
//Ngon ngu lap trinh C++ - D2
//01
//Le Van Cong
//THCS2D20
//Tin hoc co so 2 - D20
//02
//Nguyen Trung Binh
//LTHDTD19
//Lap trinh huong doi tuong - D19
//01
//Nguyen Binh An
//1
//THCS2D20