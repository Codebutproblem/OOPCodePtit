
import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class JKT013 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<String>q = new LinkedList<>();
            q.add("6");
            q.add("8");
            Stack<String>st = new Stack<>();
            while(true){
                String m = q.peek();
                q.poll();
                if(m.length() > n){
                    break;
                }
                st.add(m);
                q.add(m + "6");
                q.add(m+"8");
            }
            System.out.println(st.size());
            while(!st.isEmpty()){
                System.out.print(st.peek()+ " ");
                st.pop();
            }
            System.out.println("");
        }
    }
}
