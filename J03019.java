
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class J03019 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = ""+s.charAt(s.length()-1);
        for(int i = s.length()-2; i >= 0; i--){
            if(s.charAt(i) >= res.charAt(0)){
                res = s.charAt(i) + res;
            }
        }
        System.out.println(res);
    }
}
