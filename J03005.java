import java.io.*;
import java.util.*;


public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine().trim();
            String[]arr = s.split("\\s+");
            arr[arr.length-1] += ",";

            StringBuilder sb = new StringBuilder("");
            for(int i = 1; i < arr.length ; i++){
                String x = arr[i];
                sb.append(Character.toUpperCase(x.charAt(0)));
                for(int j = 1; j < x.length(); j++){
                    sb.append(Character.toLowerCase(x.charAt(j)));
                }
                sb.append(" ");
            }
            sb.append(arr[0].toUpperCase());
            System.out.println(sb.toString());
        }
    }   
    
}
