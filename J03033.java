
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class J03033 {  
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger c = (a.divide(a.gcd(b))).multiply(b);
            System.out.println(c);
        }
    }
}
