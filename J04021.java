import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
class IntSet{
    private int arr[];
    public IntSet(int[] arr) {
        this.arr = arr;
    }
    public IntSet union(IntSet o){
        TreeSet<Integer>set = new TreeSet<>();
        for(int x : this.arr){
            set.add(x);
        }
        for(int x : o.arr){
            set.add(x);
        }
        int[]res = new int[set.size()];
        int i = 0;
        for(int x : set){
            res[i++] = x;
        }
        return new IntSet(res);
    }

    @Override
    public String toString() {
        String res = "";
        for(int x : arr){
            res += x + " ";
        }
        return res;
    }
    
}
public class J04021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
    public static void main1591570(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
