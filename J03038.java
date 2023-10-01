
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class J03038 {  
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashSet<Character>set = new HashSet<>();
        String s = sc.nextLine();
        for(char x : s.toCharArray()){
            set.add(x);
        }
        System.out.println(set.size());
    }
}
