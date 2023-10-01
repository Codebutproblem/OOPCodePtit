import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            String s = a.subtract(b).toString();
            if(s.charAt(0) == '-'){
               s = s.substring(1);
            }
            int l = Math.max(a.toString().length(), b.toString().length());
            while(s.length() < l){
                s = "0"+s;
            }
            System.out.println(s);
        }
    }   
    
}
