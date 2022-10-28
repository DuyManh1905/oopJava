/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class SoPhuc {
    private long thuc,ao;

    public SoPhuc(long thuc, long ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public SoPhuc() {
    }
    public SoPhuc cong(SoPhuc moi){
        SoPhuc res=new SoPhuc();
        res.thuc=this.thuc+moi.thuc;
        res.ao=this.ao+moi.ao;
        return res;
    }
    public SoPhuc nhan(SoPhuc moi){
        SoPhuc res=new SoPhuc();
        res.thuc=this.thuc*moi.thuc - this.ao*moi.ao;
        res.ao=this.thuc*moi.ao + this.ao*moi.thuc;
        return res;
    }

    @Override
    public String toString() {
        return thuc+" + "+ao+"i";
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong();
            SoPhuc x=new SoPhuc(a, b);
            SoPhuc y=new SoPhuc(c, d);
            SoPhuc s1=(x.cong(y)).nhan(x);
            SoPhuc s2=(x.cong(y)).nhan(x.cong(y));
            System.out.println(s1+", "+s2);
        }
    }
}
