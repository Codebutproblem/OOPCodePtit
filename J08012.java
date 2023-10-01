
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class J08012 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[n+1];
        for(int i = 0; i < n-1; i++){
            int x = sc.nextInt(),y = sc.nextInt();
            cnt[x]++;cnt[y]++;
        }
        String ans = "No";
        for(int i = 1; i <= n; i++){
            if(cnt[i] == n-1){
                ans = "Yes";
                break;
            }
        }
        System.out.println(ans);
    }
}
