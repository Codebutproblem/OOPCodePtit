
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class J07022 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            ArrayList<String>arr = new ArrayList<>();
            while(sc.hasNext()){
                String s = sc.next();
                try{
                    long x = Long.parseLong(s);
                }
                catch(Exception e){
                    arr.add(s);
                }
            }
            Collections.sort(arr);
            for(String x : arr){
                System.out.print(x+ " ");
            }
        }
        catch(FileNotFoundException ex){
            
        }
    }
}
