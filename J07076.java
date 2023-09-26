import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class J07076 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(),m = sc.nextInt(),k = sc.nextInt();
            int[][] a = new int[m][n];
            for(int i = 0; i < n ;i++){
                for(int j = 0; j < m ;j++){
                    a[j][i] = sc.nextInt();
                }
            }
            Arrays.sort(a[k-1]);
            for(int i = 0; i < n ;i++){
                for(int j = 0; j < m; j++){
                    System.out.print(a[j][i] + " ");
                }
                System.out.println("");
            }
        }
    }
}
