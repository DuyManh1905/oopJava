package OOP_codeptit;

import java.util.Scanner;

class Matrix{
    int n,m;
    int a[][] = new int[100][100];
    public Matrix(int n,int m){
        this.n = n;
        this.m = m;
    }
    public void nextMatrix(Scanner sc){
        for(int i = 0;i < n; i++){
            for(int j = 0; j< m ;j++) a[i][j] = sc.nextInt();
        }
    }
    public String mul(Matrix s) {
        String res ="";
        int c[][] = new int[n][n];
        for(int i = 0 ;i < n;i++){
            for(int j = 0; j < n;j++){
                c[i][j] = 0;
                for(int k = 0; k < m; k++){
                    c[i][j] += (a[i][k]*s.a[k][j]);
                }
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0 ;j < n ;j++){
                res= res+ String.valueOf(c[i][j])+" ";
            }
            if(i<n-1) res+="\n";
        }
        return res;
    }
}

public class TichHaiDoiTuongMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}

