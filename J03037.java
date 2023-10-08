import java.util.*;

public class J03037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[256];
        String s = sc.next();
        long ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(cnt[s.charAt(i)] == 0){
                cnt[s.charAt(i)] = 1;
                int j = i+1;
                while(s.charAt(j)!= s.charAt(i)){
                    if(cnt[s.charAt(j)] == 1) ans++;
                    j++;
                }
            }
        }
        System.out.println(ans);
    }
}
