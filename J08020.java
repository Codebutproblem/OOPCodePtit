
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class J08020 {
    public static boolean check(String s){
        Stack<Character>st = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == '(' || x == '[' || x == '{'){
                st.push(x);
            }
            else{
                if(x == ')'){
                    if(!st.empty() && st.peek() == '('){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                if(x == ']'){
                    if(!st.empty() && st.peek() == '['){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                if(x == '}'){
                    if(!st.empty() && st.peek() == '{'){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return st.empty();
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
