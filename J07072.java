import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
public class J07072 {
    public static void main(String[] args) throws ParseException, FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<String>ans = new ArrayList<>();
        while(sc.hasNext()){
            String[] arr = sc.nextLine().trim().split("\\s+");
            String res = "";
            for(String s : arr){
                res += Character.toUpperCase(s.charAt(0));
                for(int i = 1; i < s.length(); i++){
                    res += Character.toLowerCase(s.charAt(i));
                }
                res += " ";
            }
            ans.add(res);
        }
        Collections.sort(ans,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                String[] s1 = o1.split("\\s+"), s2 = o2.split("\\s+");
                if(s1[s1.length-1].compareTo(s2[s2.length-1]) != 0) return s1[s1.length-1].compareTo(s2[s2.length-1]);
                return o1.compareTo(o2);
            }
        });
        for(String x : ans){
            System.out.println(x);
        }
    }
}
