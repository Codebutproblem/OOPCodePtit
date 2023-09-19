import java.util.*;

public class J01018  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String ans = "YES";
            for(int i = 1; i < s.length(); i++){
                if(Math.abs(s.charAt(i)-s.charAt(i-1)) != 2){
                    ans = "NO";
                    break;
                }
            }
            int sum = 0;
            for(char x : s.toCharArray()){
                sum += x -'0';
            }
            if(sum%10 == 0 && ans == "YES"){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
