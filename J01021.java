import java.util.*;

public class J01021 {
    public static long mod = 1000000007;
    public static long super_pow(long a, long b){
        if(b == 1) return a;
        long x = super_pow(a,b/2);
        if(b%2 == 1){
            return (((x%mod)*(x%mod))%mod *a)%mod;
        }
        else{
            return ((x%mod)*(x%mod))%mod;
        }
    }
    public static long super_pow_2(long a, long b){
        long res = 1;
        while(b != 0){
            if(b%2 == 1){
                res *= a;
                res %= mod;
            }
            b /= 2;
            a *= a;
            a%=mod;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong(),b = sc.nextLong();
            if(a == 0 && b == 0) break;
            System.out.println(super_pow_2(a,b));
        }
    }
}
