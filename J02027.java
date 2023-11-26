
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class J02027 {
    public static int lower_bound(int a[],int x){
        int res = a.length;
        int left = 0,right = a.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(a[mid] >= x){
                right = mid-1;
                res = mid;
            }
            else{
                left = mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[]a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long ans = 0;
            for(int i = 0; i < n; i++){
                ans += lower_bound(a,k+a[i]) -i-1;
            }
            System.out.println(ans);
        }
    }
}
//1 2 4 10
