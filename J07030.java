import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
public class J07030 {
    public static boolean nt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return n > 1;
    }
    public static void main(String[] args){
        ArrayList<Integer>a = null,b = null;
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));
            a = (ArrayList<Integer>) input.readObject();
            input = new ObjectInputStream(new FileInputStream("DATA2.in"));
            b = (ArrayList<Integer>) input.readObject();
            input.close();
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        TreeSet<Integer>set1 = new TreeSet<>(),set2 = new TreeSet<>();
        for(int x : a){
            if(nt(x)){
                set1.add(x);
            }
        }
        for(int x : b){
            if(nt(x)){
                set2.add(x);
            }
        }
        for(int x : set1){
            if(set2.contains(1000000-x) && x < 1000000-x){
                System.out.println(x + " " + (1000000 - x));
            }
        }
    }
}
