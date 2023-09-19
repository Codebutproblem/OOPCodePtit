import java.util.*;

public class J01024 {
    public static String check(String s){
        for(char x : s.toCharArray()){
            if(x != '1' && x != '2' && x != '0'){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            System.out.println(check(sc.next()));
        }
    }
}
