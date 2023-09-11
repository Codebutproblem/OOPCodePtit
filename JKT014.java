
import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class JKT014 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n;i++){
                a[i] = sc.nextInt();
            }
            Stack<Integer>st = new Stack<>();
            for(int i = 0; i < n; i++){
                while(!st.empty() && a[i] >= a[st.peek()]){
                    st.pop();
                }
                if(st.empty()){
                    System.out.print((i+1) + " ");
                }
                else{
                    System.out.print((i-st.peek()) + " ");
                }
                st.push(i);
            }
            System.out.println("");
        }
        
    }
}
