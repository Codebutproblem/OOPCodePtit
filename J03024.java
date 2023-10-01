
import java.util.*;



public class J03024 {
    public static String check(String s){
        if(s.charAt(0) == '0'){
            return "INVALID";
        }
        int chan = 0,le = 0;
        for(char x: s.toCharArray()){
            if(!Character.isDigit(x)){
                return "INVALID";
            }
            if((x-'0')%2 == 0){
                chan++;
            }
            else{
                le++;
            }
        }
        
        if(s.length()%2 == 0 && chan > le){
            return "YES";
        }
        if(s.length()%2 == 1 && chan < le){
            return "YES";
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
