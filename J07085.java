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
public class J07085 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String>arr = (ArrayList<String>) input.readObject();
        for(String s : arr){
            int idx = 0;
            String ans = "";
            s = s + "A";
            for(int i = 1; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i)) && !Character.isDigit(s.charAt(i-1))){
                    idx = i;
                }
                if(!Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i-1))){
                    ans = ans + s.substring(idx,i);
                }
            }
            IN(ans);
        }
    }

    private static void IN(String s) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        System.out.print(sb.toString() + " ");
        long ans = 0;
        for(char x : s.toCharArray()){
            ans += (x - '0');
        }
        System.out.println(ans);
    }
}
