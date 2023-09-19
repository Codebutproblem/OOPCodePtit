import java.util.*;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String ans = "YES";
            for(int i = 1; i < s.length(); i++){
                if(Math.abs(s.charAt(i)-s.charAt(i-1)) != 1){
                    ans = "NO";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
