
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;




public class J02026 {
    public static int n,k;
    public static int[]a;
    public static void Try(int i,int cnt,ArrayList<Integer>arr){
        for(int j = i; j < n; j++){
            arr.add(a[j]);
            if(cnt+1 == k){
                print(arr);
            }
            Try(j+1,cnt+1,arr);
            arr.remove(arr.size()-1);
        }
    }
    private static void print(ArrayList<Integer>arr) {
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            k = sc.nextInt();
            a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            ArrayList<Integer>arr = new ArrayList<>();
            Try(0,0,arr);
        }
    }
}
