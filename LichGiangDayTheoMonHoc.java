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
public class LichGiangDayTheoMonHoc {
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
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int t=Integer.parseInt(sc.nextLine());
        List<MH> l1=new ArrayList<>();
        List<LH> l2=new ArrayList<>();  
        for(int i=1;i<=t;i++){
            l1.add(new MH(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        sc.close();
        sc=new Scanner(new File("LICHGD.in"));
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            l2.add(new LH(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        }
        l2.sort(new Comparator<LichGiangDayTheoMonHoc.LH>() {
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
        String mon=sc.nextLine();
        for(MH x:l1){
            if(x.ma.equals(mon)){
                String a=x.ten;
                System.out.println("LICH GIANG DAY MON "+a+":");
                break;
            }
        }
        for(LH x:l2){
            if(x.maMon.equals(mon)){
                System.out.println(x.maNhom+" "+x.thu+" "+x.kip+" "+x.tenGV+" "+x.tenPhongHoc);
            }
        }
    }
}
//2
//INT1155
//Tin hoc co so 2
//2
//INT13162
//Lap trinh voi Python
//3
//4
//INT13162
//5
//1
//Nguyen Hoang Anh
//102-A2
//INT1155
//3
//1
//Nguyen Dinh Hien
//201A-A3
//INT1155
//4
//1
//Nguyen Quy Sy
//201A-A3
//INT1155
//5
//1
//Tran Quy Nam
//201A-A3
//INT1155

//LICH GIANG DAY MON Tin hoc co so 2:
//HP002 3 1 Nguyen Dinh Hien 201A-A3
//HP003 4 1 Nguyen Quy Sy 201A-A3
//HP004 5 1 Tran Quy Nam 201A-A3
//
//LICH GIANG DAY MON Tin hoc co so 2:
//HP002 3 1 Nguyen Dinh Hien 201A-A3
//HP003 4 1 Nguyen Quy Sy 201A-A3
//HP004 5 1 Tran Quy Nam 201A-A3