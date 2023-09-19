import java.util.*;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            String s = sc.next();
            int cnt = 0;
            for(char x :s.toCharArray()){
                if(x == '4' || x == '7'){
                    cnt++;
                }
            }
            if(cnt == 4 || cnt == 7){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
