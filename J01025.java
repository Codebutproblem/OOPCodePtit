import java.util.*;


public class J01025 {
    public static String check(long n){
        long can = (long)Math.sqrt(n);
        
        if(can*can == n){
            return "YES";
        }
        else{
            return "NO";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rect1 = new int[4];
        int[] rect2 = new int[4];

        for (int i = 0; i < 4; i++) {
            rect1[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            rect2[i] = sc.nextInt();
        }

        int minX = Math.min(rect1[0], rect2[0]);
        int minY = Math.min(rect1[1], rect2[1]);
        int maxX = Math.max(rect1[2], rect2[2]);
        int maxY = Math.max(rect1[3], rect2[3]);

        int side = Math.max(maxX - minX, maxY - minY);
        int squareArea = side * side;

        System.out.println(squareArea);
    }
}
