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
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class TenVietTat {

    static class Name {

        private String ten, vietTat;

        public Name(String ten) {
            this.ten = ten;
            String a[] = ten.split("\\s+");
            String res = "";
            for (int i = 0; i < a.length; i++) {
                res += a[i].charAt(0);
                if (i != a.length - 1) {
                    res += ".";
                }
            }
            this.vietTat = res;
        }

    }

    public static void main(String[] args) throws IOException {
        File file = new File("DANHSACH.in");
        Scanner sc = new Scanner(file);
        int t = Integer.parseInt(sc.nextLine());
        List<Name> l = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String ten = sc.nextLine();
            l.add(new Name(ten));
        }
        Collections.sort(l, new Comparator<TenVietTat.Name>() {
            @Override
            public int compare(Name t, Name t1) {
                String a[] = t.ten.split("\\s+");
                String b[] = t1.ten.split("\\s+");
                if (a[a.length - 1] != b[b.length - 1]) {
                    return a[a.length - 1].compareTo(b[b.length - 1]);
                }
                return t.ten.compareTo(t1.ten);
            }
        });
        int q = sc.nextInt();
        while (q-- > 0) {
            String x = sc.next();
            for (Name y : l) {
                boolean ok = true;
                if (x.length() == y.vietTat.length()) {
                    for (int i = 0; i < x.length(); i++) {
                        if (x.charAt(i) != y.vietTat.charAt(i) && x.charAt(i) != '*') {
                            ok = false;
                            break;
                        }
                    }
                    if (ok) {
                        System.out.println(y.ten);
                    }
                }
            }
        }
    }
}
//4
//Nguyen Manh Son
//Ngo Minh Tuan
//Nguyen Manh Hung
//Tran Trung Dung
//1
//N.M.*
