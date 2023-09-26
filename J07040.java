import java.io.*;
import java.util.*;
public class J07040 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> arr = (ArrayList<String>) input.readObject();
        input.close();
        
        HashSet<String>set1 = new HashSet<>();
        HashSet<String>set = new HashSet<>();
        ArrayList<String>res = new ArrayList<>();
        
        
        for(String x : arr){
            String[] a = x.split("\\s+");
            for(String i : a){
                set1.add(i.toLowerCase());
            }
        }
        
        
        Scanner sc = new Scanner(new File("VANBAN.in"));
        String s;
        while(sc.hasNext()){
            s = sc.nextLine().toLowerCase();
            String[]a = s.split("\\s+");
            for(String x : a){
                res.add(x);
                if(set1.contains(x)) set.add(x);
            }
        }
        for(String x : res){
            if(set.contains(x)){
                System.out.println(x);
                set.remove(x);
            }
        }
    }
}
