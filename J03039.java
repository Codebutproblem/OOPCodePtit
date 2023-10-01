
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class J03039  {  
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger c = a.remainder(b), d = b.remainder(a);
            if(c.toString().equals("0") || d.toString().equals("0")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
