import java.util.*;


public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[]a = new int[n];
            int sum_right =0,sum_left = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum_right += a[i];
            }
            sum_right -= a[0];
            int ans =-1;
            for(int i = 0; i < n ;i++){
                if(sum_right == sum_left){
                    ans = i+1;
                    break;
                }
                if(i != n-1){
                    sum_right -= a[i+1];
                    sum_left+=a[i];
                }
            }
            System.out.println(ans);
        }
    }
}
