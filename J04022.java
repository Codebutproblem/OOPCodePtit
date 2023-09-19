import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
class WordSet{
    private String arrString;

    public WordSet(String arrString) {
        this.arrString = arrString;
    }
    
    public WordSet union(WordSet o){
        TreeSet<String>set = new TreeSet<>();
        String res = "";
        for(String x : this.arrString.toLowerCase().split("\\s+")){
            set.add(x);
        }
        for(String x : o.arrString.toLowerCase().split("\\s+")){
            set.add(x);
        }
        for(String x : set){
            res += x + " ";
        }
        return new WordSet(res);
    }
    public WordSet intersection(WordSet o){
        TreeSet<String>set1 = new TreeSet<>(),set2 = new TreeSet<>();
        String res = "";
        for(String x : this.arrString.toLowerCase().split("\\s+")){
            set1.add(x);
        }
        for(String x : o.arrString.toLowerCase().split("\\s+")){
            if(set1.contains(x)){
                set2.add(x);
            }
        }for(String x : set2){
            res += x + " ";
        }
        return new WordSet(res);
    }

    @Override
    public String toString() {
        return arrString;
    }
    
}
public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main1467565(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
