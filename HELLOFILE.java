
import java.io.File;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("Hello.txt"));
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }
        catch(Exception ex){
            
        }
    }
    
}
