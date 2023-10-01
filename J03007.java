import java.io.*;
import java.util.*;


public class J03007 {
    public static int sum(String s){
        int res = 0;
        for(char x : s.toCharArray()){
            res += x -'0';
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            sb = sb.reverse();
            
            if(sum(s)%10 == 0 && s.charAt(s.length()-1) == '8' && sb.toString().equals(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }   
    
}
