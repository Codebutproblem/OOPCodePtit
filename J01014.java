import java.util.*;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long res = 2;
            for(int i = 2; i <= Math.sqrt(n); i++){
                while(n%i == 0){
                    res = i;
                    n /= i;
                }
            }
            if(n!= 1){
                res = n;
            }
            System.out.println(res);
        }
    }
}
