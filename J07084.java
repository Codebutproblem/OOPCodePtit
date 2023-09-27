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
class SV implements Comparable<SV>{
    private String ten;
    private Date start,end;
    private long time;
    public SV(String ten, String timeStart,String timeEnd) throws ParseException{
        this.ten = ten;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        start = sdf.parse(timeStart);
        end = sdf.parse(timeEnd);
        this.time = ChronoUnit.MINUTES.between(start.toInstant(), end.toInstant());
    }

    @Override
    public int compareTo(SV o) {
        if(this.time != o.time){
            if(this.time < o.time) return 1;
            else return -1;
        }
        else return this.ten.compareTo(ten);
    }

    @Override
    public String toString() {
        return ten + " "+time;
    }
    
}
public class J07084 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = sc.nextInt();
        SV[] arr = new SV[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            arr[i] = new SV(sc.nextLine(),sc.nextLine(),sc.nextLine()) ;
        }
        Arrays.sort(arr);
        for(SV x : arr){
            System.out.println(x);
        }
    }
}
