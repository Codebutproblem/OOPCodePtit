import java.io.*;
import java.util.*;

class WordSet{
    TreeSet<String>set;
    public WordSet(String s){
        try{
            Scanner sc = new Scanner(new File(s));
            set = new TreeSet<>();
            while(sc.hasNext()){
                set.add(sc.next().toLowerCase());
            }
        }
        catch(FileNotFoundException ex){
            
        }
    }

    @Override
    public String toString() {
        String res = "";
        for(String x: this.set){
            res += x + "\n";
        }
        return res;
    }
    
}

public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
    public static void main7475889(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}

