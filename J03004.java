import java.io.*;
import java.util.*;


public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine().trim();
            String[]arr = s.split("\\s+");
            StringBuilder sb = new StringBuilder("");
            for(String x : arr){
                sb.append(Character.toUpperCase(x.charAt(0)));
                for(int i = 1; i < x.length(); i++){
                    sb.append(Character.toLowerCase(x.charAt(i)));
                }
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
        }
    }   
    
}
