import java.io.*;
import java.util.*;
public class J07032 {
    public static int[] cnt = new int[1000005];
    private static boolean check(int n){
        String s = n + "";
        int i = 0, j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;j--;
        }
        while(n > 0){
            if((n%10)%2 == 0) return false;
            n /= 10;
        }
        return s.length()%2 == 1 && s.length() > 1;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr_1 = (ArrayList<Integer>) input.readObject();
        input = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr_2 = (ArrayList<Integer>) input.readObject();
        
        
        TreeSet<Integer>set = new TreeSet<>();
        for(int x : arr_1){
            cnt[x]++;
        }
        for(int x : arr_2){
            if(cnt[x] != 0){
                cnt[x]++;
                set.add(x);
            }
        }
        int dem = 0;
        for(int x : set){
            if(check(x) && dem < 10){
                System.out.println(x + " " + cnt[x]);
                dem++;
            }
            
        }
    }
}
