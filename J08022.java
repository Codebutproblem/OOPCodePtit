
import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class J08022 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Stack<Integer>st = new Stack<>();
            ArrayList<Integer>arr = new ArrayList<>();
            for(int i = n-1; i >= 0; i--){
                while(!st.isEmpty() && a[i] >= st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    arr.add(-1);
                }
                else{
                    arr.add(st.peek());
                }
                st.push(a[i]);
            }
            for(int i = n-1; i >= 0; i--){
                System.out.print(arr.get(i)+ " ");
            }
            System.out.println("");
        }
    }
}
