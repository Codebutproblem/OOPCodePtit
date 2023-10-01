
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        TreeSet<Integer>set = new TreeSet<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        if (set.size() == set.last()){
            System.out.println("Excellent!");
            return;
        }
        for(int i = 1; i <= set.last(); i++){
            if(! set.contains(i)){
                System.out.println(i);
            }
        }
    }
    
}
