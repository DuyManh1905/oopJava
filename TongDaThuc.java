package OOP_codeptit;

import java.util.ArrayList;
import java.util.Scanner;

public class TongDaThuc {
    static class DaThuc{
        int heso,somu;
        String s;
        public DaThuc(String s){
            this.s =s;
        }
        public DaThuc cong(DaThuc b){
            ArrayList<DaThuc> arr = new ArrayList<>();
            ArrayList<DaThuc> arr1 = new ArrayList<>();
            ArrayList<DaThuc> ar = new ArrayList<>();
            String res[] = s.split("\\*|x|\\^|\\+|\\ ");
            String res1[] = b.s.split("\\*|x|\\^|\\+|\\ ");
            for(int i = 0;i<res.length-3;i=i+6){
                DaThuc p = new DaThuc("");
                p.heso = Integer.parseInt(res[i]);
                p.somu = Integer.parseInt(res[i+3]);
                arr.add(p);
            }
            for(int i = 0;i<res1.length-3;i=i+6){
                DaThuc p = new DaThuc("");
                p.heso = Integer.parseInt(res1[i]);
                p.somu = Integer.parseInt(res1[i+3]);
                arr1.add(p);
            }
            int i =0,j=0;
            while(i<arr.size()&&j<arr1.size()){
                if(arr.get(i).somu>arr1.get(j).somu){
                    ar.add(arr.get(i));
                    i++;
                }
                else if(arr.get(i).somu<arr1.get(j).somu){
                    ar.add(arr1.get(j));
                    j++;
                }
                else{
                    DaThuc p = new DaThuc("");
                    p.heso =arr.get(i).heso+arr1.get(j).heso;
                    p.somu = arr.get(i).somu;
                    ar.add(p);
                    i++;j++;
                }
            }
            while(i<arr.size()) ar.add(arr.get(i));
            while(j<arr1.size()) ar.add(arr1.get(i));
            String ans="";
            for (int k = 0;k <ar.size()-1;k++){
                ans = ans + String.valueOf(ar.get(k).heso)+"*x^"+ String.valueOf(ar.get(k).somu)+" + ";
            }
            ans = ans+String.valueOf(ar.get(ar.size()-1).heso)+"*x^"+ String.valueOf(ar.get(ar.size()-1).somu);
            DaThuc r = new DaThuc(ans);
            return r;
        }
        @Override
        public String toString(){
            return s;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
    public static void main7421894(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
