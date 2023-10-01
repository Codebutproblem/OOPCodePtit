
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class J08021 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Số lượng test cases
        
        while (t-- > 0) {
            String s = scanner.next(); // Đọc xâu từ input
            
            int maxLength = findLongestValidParentheses(s);
            System.out.println(maxLength);
        }
    }

    public static int findLongestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Khởi tạo vị trí bắt đầu của dãy ngoặc

        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i); // Push vị trí của dấu '(' vào stack
            } else {
                stack.pop(); // Pop dấu '(' tương ứng với dấu ')'
                if (stack.isEmpty()) {
                    stack.push(i); // Đặt vị trí mới cho dấu '('
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        
        return maxLength;
    }
}
