import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class J02016  {
    public static void main(String[] args) throws ParseException, FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0 ; i < n; i++){
                a[i] = sc.nextLong();
            }
            HashSet<Long>set = new HashSet<>();
            for(int i = 0; i < n; i++){
                for(int j = i+1; j < n;j++){
                    long x = a[i]*a[i] + a[j]*a[j];
                    if(check(x)){
                        set.add(x);
                    }
                }
            }
            String ans = "NO";
            
            for(int i = 0; i < n ;i++){
                if(set.contains(a[i]*a[i])){
                    ans = "YES";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
    public static boolean check(long n){
        long x = (long)Math.sqrt(n);
        return x*x == n;
    }
}
