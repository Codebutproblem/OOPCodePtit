import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class J03011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            String x = sc.next(), y =sc.next();
            BigInteger a = new BigInteger(x);
            BigInteger b = new BigInteger(y);
            System.out.println(a.gcd(b));
        }
    }   
    
}
