import java.util.*;
import java.io.*;
class Point3D{
    private int x,y,z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    public static boolean check(Point3D p1,Point3D p2,Point3D p3,Point3D p4){
        Vector v1 = new Vector(p1,p2);
        Vector v2 = new Vector(p1,p3);
        Flat flat = new Flat(v1.normal(v2),p3);
        return flat.contains(p4);
    }
}
class Vector{
    private int x,y,z;

    public Vector(Point3D a,Point3D b) {
        this.x = a.getX()-b.getX();
        this.y = a.getY()-b.getY();
        this.z = a.getZ()-b.getZ();
    }
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector normal(Vector o){
        return new Vector(this.y*o.z - o.y*this.z,this.z*o.x - o.z*this.x,this.x*o.y - o.x*this.y) ;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    
}
class Flat{
    private int A,B,C,D;

    public Flat(Vector v,Point3D a) {
        this.A = v.getX();
        this.B = v.getY();
        this.C = v.getZ();
        this.D = v.getX()*a.getX() + v.getY()*a.getY() + v.getZ()*a.getZ();
    }
    public boolean contains(Point3D point){
        return this.A*point.getX() + this.B*point.getY() + this.C*point.getZ() == D;
    }
    
}
public class J04011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
    public static void main2985315(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}
