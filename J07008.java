
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class J07008 {
    public static ArrayList<Integer>arr = new ArrayList<>();
    public static TreeSet<String>set = new TreeSet<>();
    public static void solve(){
        if(arr.size() < 2) return;
        for(int i = 0; i < arr.size()-1; i++){
            if(arr.get(i) >= arr.get(i+1)){
                return;
            }
        }
        String s = "";
        for(int x : arr){
            s = s + x + " ";
        }
        set.add(s);
    }
    public static void Try(int i,int n, int[]a){
        if(i == n){
            solve();
            return;
        }
        for(int j = 0; j <= 1; j++){
            if(j == 1){
                arr.add(a[i]);
                Try(i+1,n,a);
                arr.remove(arr.size()-1);
            }
            else{
                Try(i+1,n,a);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        int[]a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Try(0,n,a);
        for(String x : set){
            System.out.println(x);
        }
    }
}
