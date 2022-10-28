package OOP_codeptit;
import java.util.Scanner;

public class BonDiemTrenMatPhang {
    static class Point3D {
        int x, y, z;
        Point3D() {
        }
        Point3D(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        static boolean check(Point3D a, Point3D b, Point3D c, Point3D d) {
            int a1 = b.x - a.x;
            int b1 = b.y - a.y;
            int c1 = b.z - a.z;
            int a2 = c.x - a.x;
            int b2 = c.y - a.y;
            int c2 = c.z - a.z;
            int A = b1 * c2 - b2 * c1;
            int B = a2 * c1 - a1 * c2;
            int C = a1 * b2 - b1 * a2;
            int D = -A * a.x - B * a.y - C * a.z;
            return (A * d.x + B * d.y + C * d.z + D == 0) ? true : false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if (Point3D.check(p1, p2, p3, p4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
