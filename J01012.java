
import java.io.File;
import java.util.Scanner;



public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            long ans = 0;
            for(int i = 1; i <= Math.sqrt(n); i++){
                if(n%i == 0){
                    if(i%2 == 0){
                        ans++;
                    }
                    if( i != n/i &&(n/i)%2 == 0){
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
    
}
