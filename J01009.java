
import java.io.File;
import java.util.*;


public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] f = new long[25];
        f[0]=1;
        for(int i = 1; i <= 20; i++){
            f[i] = f[i-1]*i;
        }
        int n = sc.nextInt();
        long ans = 0;
        for(int i = 1; i <= n;i++){
            ans += f[i];
        }
        System.out.println(ans);
    }
    
}
