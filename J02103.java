
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 1;
        while(t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n+1][m+1];
            int[][] b = new int[m+1][n+1];
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            System.out.println("Test " + cnt++ + ":");
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    long res = 0;
                    for(int k = 1; k <= m; k++){
                        res += a[i][k]*b[k][j];
                    }
                    System.out.print(res+" ");
                }
                System.out.println("");
            }
        }
    }
    
}
