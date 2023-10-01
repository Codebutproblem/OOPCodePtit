import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class JKT015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        LinkedList<Character> text = new LinkedList<>();
        ListIterator<Character> cursor = text.listIterator();

        for (char c : input.toCharArray()) {
            if (c == '-') {
                if (cursor.hasPrevious()) {
                    cursor.previous();
                    cursor.remove();
                }
            } else if (c == '<') {
                if (cursor.hasPrevious()) {
                    cursor.previous();
                }
            } else if (c == '>') {
                if (cursor.hasNext()) {
                    cursor.next();
                }
            } else {
                cursor.add(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : text) {
            result.append(c);
        }

        System.out.println(result.toString());
    }
}
