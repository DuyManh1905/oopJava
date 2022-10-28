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
public class DanhSachThucTap1 {
    static class DS{
        private int stt;
        private String ma,ten,lop,mai,dn;

        public DS(int stt, String ma, String ten, String lop, String mai, String dn) {
            this.stt = stt;
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.mai = mai;
            this.dn = dn;
        }

        @Override
        public String toString() {
            return stt+" "+ma+" "+ten+" "+lop+" "+mai+" "+dn;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<DS> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            l.add(new DS(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(l, new Comparator<DanhSachThucTap1.DS>() {
            @Override
            public int compare(DS t, DS t1) {
                return t.ten.compareTo(t1.ten);
            }
        });
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String ct=sc.nextLine();
            for(DS x:l){
                if(x.dn.equals(ct)){
                    System.out.println(x);
                }
            }
        }
    }
}

//6
//B17DCCN016 
//Le Khac Tuan Anh 
//D17HTTT2   
//test1@stu.ptit.edu.vn
//VIETTEL
//B17DCCN107 
//Dao Thanh Dat    
//D17CNPM5   
//test2@stu.ptit.edu.vn
//FPT
//B17DCAT092 
//Cao Danh Huy     
//D17CQAT04-B
//test3@stu.ptit.edu.vn
//FPT
//B17DCCN388 
//Cao Sy Hai Long  
//D17CNPM2   
//test4@stu.ptit.edu.vn
//VNPT
//B17DCCN461 
//Dinh Quang Nghia 
//D17CNPM2   
//test5@stu.ptit.edu.vn
//FPT
//B17DCCN554 
//Bui Xuan Thai    
//D17CNPM1   
//test6@stu.ptit.edu.vn
//GAMELOFT
//1
//FPT