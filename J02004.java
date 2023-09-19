import java.util.*;


public class J02004  {
    public static String check(int[] a){
        int i = 0, j = a.length-1;
        while(i < j){
            if(a[i] != a[j]){
                return "NO";
            }
            i+= 1;
            j -= 1;
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            System.out.println(check(a));
        }
    }
}
