
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;




public class J02024 {
    public static int n;
    public static int[]a;
    public static ArrayList<String>result = new ArrayList<>();
    public static void Try(int i,int sum,ArrayList<Integer>arr){
        for(int j = i; j >= 0; j--){
            arr.add(a[j]);
            if((a[j]+sum)%2 == 1){
                print(arr);
            }
            Try(j-1,sum+a[j],arr);
            arr.remove(arr.size()-1);
        }
    }
    private static void print(ArrayList<Integer>arr) {
        String res = "";
        for(int x : arr){
            res += x + " ";
        }
        result.add(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            result.clear();
            a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            ArrayList<Integer>arr = new ArrayList<>();
            Try(n-1,0,arr);
            Collections.sort(result,new Comparator<String>(){
                @Override
                public int compare(String o1, String o2) {
                    String[]a = o1.split("\\s+");
                    String[]b = o2.split("\\s+");
                    for(int i=0;i<a.length&&i<b.length;i++){
                        if(Integer.parseInt(a[i]) !=Integer.parseInt(b[i]) ){
                            return Integer.parseInt(a[i]) - Integer.parseInt(b[i]);
                        }
                    }
                    return a.length - b.length;
                }
            });
            for(String x : result){
                System.out.println(x);
            }
        }
    }
}
