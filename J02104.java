
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class J02104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            int n = sc.nextInt();
            int[][] a = new int[n+1][n+1];
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 1; i <= n; i++){
                for(int j = i+1; j <= n; j++){
                    if(a[i][j] == 1){
                        System.out.println("("+i+","+j+")");
                    }
                }
            }
        }
    }
    
}
