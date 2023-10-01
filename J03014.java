import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class J03014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- >0){
            String x = sc.next(), y =sc.next();
            for(int i = 0; i < x.length(); i++){
                if(x.charAt(i) != '0'){
                    x = x.substring(i);
                    break;
                }
            }
            for(int i = 0; i < y.length(); i++){
                if(y.charAt(i) != '0'){
                    y = y.substring(i);
                    break;
                }
            }
            BigInteger a = new BigInteger(x);
            BigInteger b = new BigInteger(y);
            System.out.println(a.add(b));
        }
    }   
    
}
