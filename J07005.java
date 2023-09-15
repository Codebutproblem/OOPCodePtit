import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class J07005 {  
    public static void main(String[] args) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        try{
            FileInputStream in =  new FileInputStream("DATA.IN");
            DataInputStream input = new DataInputStream(in);
            int x;
            while((x = input.readInt()) != -1){
                if(map.containsKey(x)){
                    map.put(x, map.get(x)+1);
                }
                else{
                    map.put(x, 1);
                }
            }
            input.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Set<Map.Entry<Integer,Integer>>entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
