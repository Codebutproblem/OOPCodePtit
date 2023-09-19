
import java.io.File;
import java.util.*;


public class J01007 {
    public static String fibo(long n){
        if(n == 0 || n == 1){
            return "YES";
        }
        long a = 1,b=1,c=1;
        for(int i = 3; i <= 92; i++){
            c = a+b;
            a = b;
            b = c;
            if(c == n){
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(fibo(n));
        }
    }
    
}
