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
public class J02023 {
    public static void main(String[] args) throws ParseException, FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),s = sc.nextInt();
        if(9*n < s || (s == 0 && n > 1)){
            System.out.println("-1 -1");
            return;
        }
        int tmp = s;
        int[]a = new int[n];
        for(int i = 0; i < n ;i++) a[i] = 0;
        for(int i = n-1; i >= 0; i--){
            if(s > 9){
                a[i] = 9;
                s -= 9;
            }
            else{
                a[i] = s-1;
                a[0] += 1;
                break;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i]);
        }
        System.out.print(" ");
        s = tmp;
        for(int i = 0; i < n ;i++) a[i] = 0;
        for(int i = 0; i < n; i++){
            if(s > 9){
                a[i] = 9;
                s -= 9;
            }
            else{
                a[i] = s;
                break;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i]);
        }
    }
}
