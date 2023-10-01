import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Pair implements Comparable<Pair>{
    public int first,second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair o) {
        if(this.first != o.first) return this.first - o.first;
        else return this.second - o.second;
    }
    
}
public class J02009 {
    public static void main(String[] args) throws ParseException, FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] arr = new Pair[n];
        for(int i = 0; i < n ;i++){
            arr[i] = new Pair(sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(arr);
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(arr[i].first >= ans){
                ans = arr[i].first + arr[i].second;
            }
            else{
                ans += arr[i].second;
            }
        }
        System.out.println(ans);
    }
}
