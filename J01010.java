
import java.io.File;
import java.util.Scanner;



public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            String s = sc.next();
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0' || s.charAt(i) == '1'){
                    sb.append(s.charAt(i));
                }
                if(s.charAt(i) == '8' || s.charAt(i) == '9'){
                    sb.append('0');
                }
            }
            if(sb.length() != s.length() || Long.parseLong(sb.toString()) == 0){
                System.out.println("INVALID");
            }
            else{
                System.out.println(Long.parseLong(sb.toString()));
            }
        }
    }
    
}
