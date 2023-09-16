import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
public class J07071 {
    public static void main(String[] args) throws ParseException, FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = sc.nextInt();
        String[] arr = new String[n];
        String[] tat = new String[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine().trim(),res = "";
            String[]a = s.split("\\s+");
            for(String x : a){
                res += Character.toUpperCase(x.charAt(0)) + ".";
            }
            arr[i] = s;
            tat[i] = res.substring(0,res.length()-1);
        }
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            ArrayList<String>ans = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if(tat[i].length() != s.length()) continue;
                boolean check = true;
                for(int j = 0; j < s.length(); j++){
                    if(s.charAt(j) != '*' && s.charAt(j) != tat[i].charAt(j)){
                        check = false;
                        break;
                    }
                }
                if(check){
                    ans.add(arr[i]);
                }
            }
            Collections.sort(ans, new Comparator<String>(){
                @Override
                public int compare(String o1, String o2) {
                    String[]s1 = o1.split("\\s+");
                    String[]s2 = o2.split("\\s+");
                    if(s1[s1.length-1].compareTo(s2[s2.length-1]) != 0) return s1[s1.length-1].compareTo(s2[s2.length-1]);
                    return o1.compareTo(o2);
                }
            });
            for(String x : ans){
                System.out.println(x);
            }
        }
    }
}
