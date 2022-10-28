package OOP_codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author s1mple
 */
class Sinhvien {

    String ten;
    float TBC, RL;

    public Sinhvien(String ten, String TBC, String RL) {
        this.ten = ten;
        this.TBC = Float.valueOf(TBC);
        this.RL = Float.valueOf(RL);
    }

    public String Xep_hang() {
        if (TBC >= 3.6 && RL >= 90) {
            return "XUATSAC";
        }
        if (TBC >= 3.2 && RL >= 80) {
            return "GIOI";
        }
        if (TBC >= 2.5 && RL >= 70) {
            return "KHA";
        }
        return "KHONG";
    }
}

public class HocBongSinhVien {

    public static void main(String[] args) {
        int n, m;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        scan.nextLine();
        ArrayList<Sinhvien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Sinhvien(scan.nextLine(), scan.next(),
                    scan.next()));
            scan.nextLine();
        }
        ArrayList<Float> p = new ArrayList<>();
        for (Sinhvien i : arr) {
            p.add(i.TBC);
        }
        Collections.sort(p, Collections.reverseOrder());
        float check = 0;
        int count = 0;
        for (float i : p) {
            count++;
            if (count == m) {
                check = i;
            }
        }
        count = 0;
        for (Sinhvien i : arr) {
            if (i.TBC >= check) {

                System.out.println(i.ten + ": " + i.Xep_hang());
            } else {
                System.out.println(i.ten + ": KHONG");
            }
        }
    }
}
