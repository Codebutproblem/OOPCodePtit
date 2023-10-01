import java.io.*;
import java.util.*;


public class J07001 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("");
        }
    }   
    
}
