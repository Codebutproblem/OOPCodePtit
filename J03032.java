
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class J03032 {  
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[]arr = s.split("\\s+");
            for(String x : arr){
                StringBuilder sb = new StringBuilder(x);
                System.out.print(sb.reverse().toString() + " ");
            }
            System.out.println("");
        }
    }
}
