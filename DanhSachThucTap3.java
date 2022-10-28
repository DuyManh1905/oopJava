/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class DanhSachThucTap3 {
    static class SinhVien{
        private String ma,hoTen,lop,email;

        public SinhVien(String ma, String hoTen, String lop, String email) {
            this.ma = ma;
            this.hoTen = chuanHoa(hoTen);
            this.lop = lop;
            this.email = email;
        }
        public String chuanHoa(String name){
            name=name.toLowerCase().trim();
            String a[]=name.split("\\s+");
            String res="";
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length();j++){
                    if(j==0){
                        res+=Character.toUpperCase(a[i].charAt(0));
                    }
                    else res+=a[i].charAt(j);
                }
                res+=" ";
            }
            return res.trim();
        }
        @Override
        public String toString() {
            return ma+" "+hoTen+" "+lop;
        }
    }
    static class DN{
        private String ma,ten;
        private int sl;

        public DN(String ma, String ten, int sl) {
            this.ma = ma;
            this.ten = ten;
            this.sl = sl;
        }
    }
    static class cap{
        private String s1,s2;

        public cap(String s1, String s2) {
            this.s1 = s1;
            this.s2 = s2;
        }
        
    }
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
//        Scanner sc=new Scanner(System.in);
        List<SinhVien> l1=new ArrayList<>();
        List<DN> l2=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            l1.add(new SinhVien(sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        l1.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien t, SinhVien t1) {
                return t1.ma.compareTo(t.ma);
            }
        });
        sc.close();
        sc=new Scanner(new File("DN.in"));

        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            l2.add(new DN(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        sc.close();
        sc=new Scanner(new File("THUCTAP.in"));
        int m=Integer.parseInt(sc.nextLine());
        List<cap> l3=new ArrayList<>();
        for(int i=1;i<=m;i++){
            String s=sc.nextLine();
            String a[]=s.split("\\s+");
            String maSV=a[0];
            String maDN=a[1];
            l3.add(new cap(a[1], a[0]));
        }
        l3.sort(new Comparator<cap>() {
            @Override
            public int compare(cap t, cap t1) {
                return t.s2.compareTo(t1.s2);
            }
        });
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String tc=sc.nextLine();
            int sl=1;
            int max=0;
            String tendn="";
            for(DN u:l2){
                if(tc.equals(u.ma)){
                    tendn=u.ten;
                    max=u.sl;
                    break;
                }
            }
            System.out.println("DANH SACH THUC TAP TAI "+tendn+":");
            for(cap x:l3){
                if(x.s1.equals(tc)){
                    String masv=x.s2;
                    for(SinhVien y:l1){
                        if(masv.equals(y.ma)){
                            System.out.println(y);
                            sl++;
                            break;
                        }
                    }
                }
                if(sl>max){
                    break;
                }
            }
        }
    }
}
//2
//B15DCKT150
//NGUYEN NGOC SON
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//NguyeN   TrONg Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//2
//B15DCKT150 VIETTEL
//B15DCKT199 SUN
//1
//SUN


//DANH SACH THUC TAP TAI SUN*:
//B15DCKT199 Nguyen Trong Tung D15CQKT02-B
//
//DANH SACH THUC TAP TAI SUN*:
//
//B15DCKT199 Nguyen Trong Tung D15CQKT02-B