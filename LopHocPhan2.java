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
public class LopHocPhan2 {
    private String ma,ten,nhom,tenGV;

    public LopHocPhan2(String ma, String ten, String nhom, String tenGV) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.tenGV = tenGV;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+nhom;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<LopHocPhan2> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            l.add(new LopHocPhan2(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(l,new Comparator<LopHocPhan2>() {
            @Override
            public int compare(LopHocPhan2 t, LopHocPhan2 t1) {
                if(!t.ma.equals(t1.ma)){
                    return t.ma.compareTo(t1.ma);
                }
                return t.nhom.compareTo(t1.nhom);
            }
        });
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String tv=sc.nextLine();
            System.out.print("Danh sach cho giang vien ");
            for(LopHocPhan2 x:l){
                if(x.tenGV.equals(tv)){
                    System.out.println(x.tenGV+":");
                    break;
                }
            }
            for(LopHocPhan2 x:l){
                if(x.tenGV.equals(tv)){
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