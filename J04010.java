
import java.util.*;

class Point{
    double x,y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double distance(Point a,Point b){
        return Math.sqrt(Math.pow(a.x-b.x, 2) + Math.pow(a.y-b.y, 2));
    }
}


public class J04010 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(),sc.nextDouble());
            double a = Point.distance(p1, p2);
            double b = Point.distance(p2, p3);
            double c = Point.distance(p1, p3);
            if(a+b > c && b+c > a && c+a > b){
                double x = (a+b+c)/2;
                double s =Math.sqrt(x*(x-a)*(x-b)*(x-c));
                double r = a*b*c/(4*s);
                System.out.printf("%.3f\n",Math.PI *r*r);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
