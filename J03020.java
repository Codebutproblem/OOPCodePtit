
import java.util.*;


public class J03020 {
    public static boolean check(String s){
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 0;
        LinkedHashMap<String,Integer>map = new LinkedHashMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                if(map.containsKey(s))map.put(s, map.get(s)+1);
                else map.put(s, 1);
                
                if(l < s.length()){
                    l = s.length();
                }
            }
        }
        for(String s : map.keySet()){
            if(s.length() == l){
                System.out.println(s + " " + map.get(s));
            }
        }
    }
}
