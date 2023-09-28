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
class TK implements Comparable<TK>{
    private String id,name;
    private Date start,end;
    private long timeMinutes;
    public TK(String id, String name, String start, String end) throws ParseException {
        this.id = id;
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        this.start = sdf.parse(start);
        this.end = sdf.parse(end);
        this.timeMinutes = ChronoUnit.MINUTES.between(this.start.toInstant(), this.end.toInstant());
    }
    
    @Override
    public int compareTo(TK o) {
        if(this.timeMinutes < o.timeMinutes) return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + timeMinutes/60 + " gio " + timeMinutes%60 + " phut";
    }
    
}
public class J05011 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TK[] arr = new TK[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            arr[i]= new TK(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(arr);
        for(TK x : arr){
            System.out.println(x);
        }
    }
}
