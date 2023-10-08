
import java.util.*;


public class J02035{
    public static boolean check(String s){
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[]a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            int res = 0;
            for(int i = 1; i < n; i++){
                if(a[i] < a[i-1]){
                    res = i;break;
                }
            }
            System.out.println(res);
        }
    }
}
