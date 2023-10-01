src/Main.java

import java.io.*;
import java.math.BigInteger;
import java.util.*;
class Point{
    private double x,y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(),sc.nextDouble());
    }
    public static double distance(Point p1,Point p2){
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(),2) + Math.pow(p1.getY()-p2.getY(),2));
    }
}
class Triangle{
    private double a,b,c;

    public Triangle(Point p1, Point p2, Point p3) {
        this.a = Point.distance(p1, p2);
        this.b = Point.distance(p1, p3);
        this.c = Point.distance(p2, p3);
    }
    public boolean valid(){
        if(a+b <= c || a+c <= b || b+c <= a){
            return false;
        }
        return true;
    }
    public String getPerimeter(){
        return String.format("%.3f", a+b+c);
    }
}
public class J04019{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
    public static void main7949402(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}

