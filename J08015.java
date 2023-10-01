
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class J08015 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            HashMap<Long,Integer>map = new HashMap<>();
            long[]a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
                if(map.containsKey(a[i])){
                    int x = map.get(a[i]);
                    map.put(a[i], x+1);
                }
                else{
                    map.put(a[i], 1);
                }
            }
            long ans = 0;
            for(int i = 0; i < n; i++){
                if(k-a[i] != a[i] ){
                    if(map.containsKey(k-a[i])){
                        ans += map.get(k-a[i]);
                    }       
                }
                else{
                    ans += map.get(a[i])-1;
                }
            }
            System.out.println(ans/2);
        }
    }
}
