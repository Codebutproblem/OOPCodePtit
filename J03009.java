import java.io.*;
import java.util.*;


public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String[] a = sc.nextLine().split("\\s+");
            String[] b = sc.nextLine().split("\\s+");
            TreeSet<String>set = new TreeSet<>();
            TreeSet<String>res = new TreeSet<>();
            for(String x : b){
                set.add(x);
            }
            for(String x : a){
                if(!set.contains(x)){
                    res.add(x);
                }
            }
            for(String x : res){
                System.out.print(x+ " ");
            }
            System.out.println("");
        }
    }   
    
}
