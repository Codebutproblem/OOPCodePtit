
import java.io.File;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int k = sc.nextInt();
            double h = sc.nextDouble();
            for(int i = 1; i <=k-1; i++){
                System.out.print(String.format("%.6f ", Math.sqrt(i*h/k*h)));
            }
            System.out.println("");
        }
    }
    
}
