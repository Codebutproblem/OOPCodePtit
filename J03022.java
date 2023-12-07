import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J03022 {
    public static String chuanHoa(String s){
        s = s.toLowerCase().trim();
        return Character.toUpperCase(s.charAt(0)) + s.substring(1,s.length());
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNext()){
            s += sc.next() + " ";
        }
        StringBuilder sb = new StringBuilder(s.trim());
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '?' || sb.charAt(i) == '!'){
                sb.setCharAt(i, '.');
            }
        }
        String[]arr = sb.toString().split("\\.");
        for(String x : arr){
            System.out.println(chuanHoa(x));
        }
    }
}
