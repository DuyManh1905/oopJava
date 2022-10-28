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
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class LichGiangDayTheoGiangVien {
    static class MH{
        private String ma,ten;
        private int stc;

        public MH(String ma, String ten, int stc) {
            this.ma = ma;
            this.ten = ten;
            this.stc = stc;
        }
        
    }
    static class LH{
        private String maMon,maNhom;
        private int thu,kip;
        private String tenGV,tenPhongHoc;

        public LH(int ma,String maMon, int thu, int kip, String tenGV, String tenPhongHoc) {
            this.maNhom="HP"+String.format("%03d",ma);
            this.maMon = maMon;
            this.thu = thu;
            this.kip = kip;
            this.tenGV = tenGV;
            this.tenPhongHoc = tenPhongHoc;
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
//        Scanner sc=new Scanner(new File("MONHOC.in"));
        int t=Integer.parseInt(sc.nextLine());
        List<MH> l1=new ArrayList<>();
        List<LH> l2=new ArrayList<>();  
        for(int i=1;i<=t;i++){
            l1.add(new MH(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
//        sc.close();
//        sc=new Scanner(new File("LICHGD.in"));
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            l2.add(new LH(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        }
        l2.sort(new Comparator<LH>() {
            @Override
            public int compare(LH t, LH t1) {
                if(t.thu!=t1.thu){
                    return t.thu-t1.thu;
                }
                else if(t.kip!=t1.kip){
                    return t.kip-t1.kip;
                }
                return t.tenGV.compareTo(t1.tenGV);
            }
        });
        String gv=sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN "+gv+":");
        for(LH x:l2){
            if(x.tenGV.equals(gv)){
                String a=x.maMon;
                System.out.print(x.maNhom+" ");
                for(MH y:l1){
                    if(x.maMon.equals(y.ma)){
                        System.out.print(y.ten+" ");
                    }
                }
                System.out.println(x.thu+" "+x.kip+" "+x.tenPhongHoc);
            }
        }
    }
}
//2
//INT1449       
//Phat trien ung dung cho cac thiet bi di dong
//3
//INT13162
//Lap trinh voi Python
//3
//3
//INT13162
//5
//4
//Nguyen Trong Khanh
//102-A2
//INT1449
//2
//2
//Nguyen Hoang Anh
//105-A2
//INT13162
//5
//1
//Nguyen Hoang Anh
//102-A2
//Nguyen Hoang Anh
