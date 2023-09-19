import java.util.*;

public class J01022 {
    public static long[] f = new long[100];
    public static void fibo(){
        f[1] = f[2] = 1;
        for(int i = 3; i <= 92; i++){
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibo();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(); 
            long k = sc.nextLong();
            while(n > 2){
                if(k > f[n-2]){
                    k -= f[n-2];
                    n = n-1;
                }
                else{
                    n = n-2;
                }
            }
            if(n == 1){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        }
    }
}
