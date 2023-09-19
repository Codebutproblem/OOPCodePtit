
import java.io.File;
import java.util.*;


public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1 ; k <= t; k++){
            long n = sc.nextLong();
            System.out.print("Test "+ k+": ");
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n%i == 0){
                    int cnt = 0;
                    while(n%i == 0){
                        cnt++;
                        n /= i;
                    }
                    System.out.print(i + "(" + cnt + ") ");
                }
            }
            if(n != 1){
                System.out.print(n + "("+ 1+")");
            }
            System.out.println("");
        }
    }
    
}
