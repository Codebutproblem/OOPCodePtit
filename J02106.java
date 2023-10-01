import java.io.*;
import java.util.*;


public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]a = new int[n+1][4];
        int res = 0;
        for(int i = 1; i <= n; i++){
            int cnt = 0;
            for(int j = 1; j <= 3; j++){
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1){
                    cnt++;
                }
            }
            if(cnt > 3-cnt){
                res++;
            }
        }
        System.out.println(res);
    }   
    
}
