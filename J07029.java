import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class J07029 {
    public static boolean nt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        FileInputStream in =  new FileInputStream("DATA.in");
        ObjectInputStream input = new ObjectInputStream(in);
        
        ArrayList<Integer>arr = (ArrayList<Integer>) input.readObject();
        
        for(int x : arr){
            if(nt(x)){
                if(map.containsKey(x)) map.put(x, map.get(x)+1);
                else map.put(x, 1);
            }
        }
        in.close();
        input.close();
        arr = new ArrayList<>();
        Set<Map.Entry<Integer,Integer>>entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            arr.add(entry.getKey());
        }
        for(int i = arr.size()-1; i >= arr.size()-10; i--){
            System.out.println(arr.get(i)+ " " +map.get(arr.get(i)));
        }
    }
}
