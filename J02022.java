import java.util.*;


public class J02022 {
    public static boolean check(int[]a, int n){
        for(int i = 2; i <= n; i++){
            if(Math.abs(a[i]-a[i-1]) == 1){
                return false;
            }
        }
        return true;
    }
    public static void display(int[] a,int n){
        for(int i = 1; i <= n; i++){
            System.out.print(a[i]);
        }
        System.out.println("");
    }
    public static void Try(int[]a,int n,int i,int[]visited){
        for(int j = 1; j <= n; j++){
            if(visited[j] == 0){
                visited[j] = 1;
                a[i] = j;
                if(i == n){
                   if(check(a,n)){
                       display(a,n);
                   }
                }
                else{
                    Try(a,n,i+1,visited);
                }
                visited[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n =sc.nextInt();
            int[] a = new int[n+1];
            int[] visited = new int[n+1];
            a[0] = 0;
            Try(a,n,1,visited);
        }
    }
}
