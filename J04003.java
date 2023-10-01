import java.util.*;


public class J04003 {
    public static long gcd(long a,long b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(),b = sc.nextLong();
        long k = gcd(a,b);
        a /= k;
        b /= k;
        System.out.println(a + "/"+b);
    }
}
