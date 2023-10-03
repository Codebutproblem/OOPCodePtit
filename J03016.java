import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class J03016 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger n = new BigInteger(sc.next());
            if(n.remainder(new BigInteger("11")).toString().equals("0")){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        
    }
}
