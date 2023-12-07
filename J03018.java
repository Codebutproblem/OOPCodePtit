
import java.math.BigInteger;
import java.util.Scanner;

public class J03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            if(new BigInteger(sc.next()).mod(new BigInteger("4")).toString().equals("0"))
                System.out.println(4);
            else 
                System.out.println(0);
        }
        sc.close();
    }
}
