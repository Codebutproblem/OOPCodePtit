import java.util.ArrayList;
import java.util.Scanner;

public class J03028 {
    public static String rotate(String s){
        int xoay = 0;
        for(char x : s.toCharArray()){
            xoay += (int)(x - 'A');
        }
        xoay %= 26;
        String result = "";
        for(char x : s.toCharArray()){
            result += (char)(((x - 'A') + xoay)%26 + 'A');
        }
        return result;
    }
    public static String merge(String a,String b){
        String result = "";
        for(int i = 0; i < a.length(); i++){
            result += (char)((a.charAt(i) - 'A' + b.charAt(i) - 'A')%26 + 'A');
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(merge(rotate(s.substring(0,s.length()/2)),rotate(s.substring(s.length()/2))));
        }
    }
}
