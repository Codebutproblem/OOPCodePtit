import java.util.*;

class Point{
    double x,y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double distance(Point a, Point b){
        return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
    }
}

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point a = new Point(sc.nextDouble(),sc.nextDouble());
            Point b = new Point(sc.nextDouble(),sc.nextDouble());
            System.out.printf("%.4f\n",Point.distance(a, b));
        }
    }
}
