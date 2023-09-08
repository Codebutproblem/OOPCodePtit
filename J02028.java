
import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n];
            for(int i = 0; i < n;i++){
                a[i] = sc.nextInt();
            }
            long sum = 0;
            int j = -1;
            String ans = "NO";
            for(int i = 0; i < n; i++){
                sum += a[i];
                while(sum > k){
                    sum -= a[++j];
                }
                if(sum == k && i > j){
                    ans = "YES";
                    break;
                }
            }
            System.out.println(ans);
        }
        
    }
}
