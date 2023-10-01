import java.util.*;


public class J02020 {
    public static int cnt = 0;
    public static void display(int a[],int k){
        for(int i = 1; i <= k; i++){
            System.out.print(a[i] +" ");
        }
        System.out.println("");
    }
    public static void Try(int[]a,int n,int k,int i){
        for(int j = a[i-1]+1; j <= n-k+i; j++){
            a[i] = j;
            if(i == k){
                cnt++;
                display(a,k);
            }
            else{
                Try(a,n,k,i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(), k = sc.nextInt();
        int[] a = new int[k+1];
        a[0] = 0;
        Try(a,n,k,1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
