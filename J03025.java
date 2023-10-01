
import java.util.*;



public class J03025 {
    public static String check(String s){
        int i = 0, j = s.length()-1,cnt = 0;
        while(i < j){
            if (s.charAt(i) != s.charAt(j)){
                cnt++;
            }
            i++;j--;
        }
        if(cnt == 1) return "YES";
        if(cnt == 0){
            if(s.length()%2 == 1) return "YES";
            else return "NO";
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}
