import java.io.*;
import java.util.*;


public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer>map = new HashMap<>();
        while(t-- >0){
            String s = sc.nextLine().trim();
            String[] arr = s.split("\\s+");
            String res = "";
            res += arr[arr.length-1].toLowerCase();
            for(int i = 0; i < arr.length-1; i++){
                res += Character.toLowerCase(arr[i].charAt(0));
            }
            if(map.containsKey(res)){
                int x = map.get(res);
                map.put(res, x+1);
                res += (x+1);
                
            }
            else{
                map.put(res, 1);
            }
            res += "@ptit.edu.vn";
            System.out.println(res);
        }
    }   
    
}
