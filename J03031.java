import java.util.*;

public class J03031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int k = sc.nextInt();
            HashSet<Character>set = new HashSet<>();
            for(char x : s.toCharArray()){
                set.add(x);
            }
            if(26-set.size() <= k && s.length() >= 26)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
