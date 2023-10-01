
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class J07004 {  
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer,Integer> map = new TreeMap<>();
        while(sc.hasNext()){
            int x = sc.nextInt();
            if(map.containsKey(x)){
                int k = map.get(x);
                map.put(x, k+1);
            }
            else{
                map.put(x, 1);
            }
        }
        Set<Map.Entry<Integer,Integer>>entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
