package OOP_codeptit;

import java.util.Scanner;


public class TichMaTranVaChuyenViCuaNo {
    static class Matrix{
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
        public void transs(Matrix s){
            int d[][] = new int[100][100];
            for(int i = 0 ; i< s.m;i++){
                for(int j = 0;j < s.n;j++){
                    d[i][j] = s.a[j][i];
                }
            }
            a = d;
        }
        public Matrix trans(){
            Matrix c= new Matrix(m, n);
            c.transs(this);
            return c;
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
}

