
import java.io.File;
import java.util.*;


public class Main {
    public static long[] f = new long[100];
    public static void fibo(){
        f[1] = f[2] = 1;
        for(int i = 3; i <= 92; i++){
            f[i] = f[i-1]+f[i-2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        fibo();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
    
}
