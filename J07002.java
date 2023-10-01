import java.io.*;
import java.util.*;


public class J07002 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            long res = 0;
            while(sc.hasNext()){
                String s = sc.next();
                try{
                    long x = Integer.parseInt(s);
                    if(x <= Integer.MAX_VALUE){
                        res += x;
                    }
                }
                catch(Exception e){
                    continue;
                }
            }
            System.out.println(res);
        }
        catch(FileNotFoundException ex){
            System.out.println("");
        }
    }   
    
}
