
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class J07021 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(true){
                String name = sc.nextLine().trim();
                if(name.equals("END")){
                    break;
                }
                String[] arr = name.split("\\s+");
                String res = "";
                for(String s : arr){
                    res += Character.toUpperCase(s.charAt(0));
                    for(int i = 1; i < s.length(); i++){
                        res += Character.toLowerCase(s.charAt(i));
                    }
                    res += " ";
                }
                System.out.println(res);
            }    
        }
        catch(FileNotFoundException ex){
            
        }
    }
}
