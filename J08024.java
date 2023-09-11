
import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class J08024 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<String>q = new LinkedList<>();
            q.add("9");
            while(true){
                long m = Long.parseLong(q.peek());
                q.poll();
                if(m%n == 0){
                    System.out.println(m);
                    break;
                }
                q.add(m + "0");
                q.add(m+"9");
            }
        }
    }
}
