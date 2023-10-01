import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
class CaThi implements Comparable<CaThi>{
    
    
    private String id;
    private Date date,time;
    private String phong;

    public CaThi(int i, Date date, Date time, String phong) {
        this.id = "C" + String.format("%03d", i);
        this.date = date;
        this.time = time;
        this.phong = phong;
    }
    
    @Override
    public int compareTo(CaThi o) {
        if(this.date.compareTo(o.date) != 0) return this.date.compareTo(o.date);
        return this.time.compareTo(o.time);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        return id + " " + dateFormat.format(date) + " " + timeFormat.format(time) + " " + phong;
    }
    
    
}
public class J07059  {
    public static void main(String[] args) throws ParseException, FileNotFoundException{
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = sc.nextInt();
        CaThi[] arr = new CaThi[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String date = sc.nextLine(),time = sc.nextLine(),phong = sc.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
            arr[i] = new CaThi(i+1,dateFormat.parse(date),timeFormat.parse(time),phong);
        }
        Arrays.sort(arr);
        for(CaThi x : arr){
            System.out.println(x);
        }
    }
}
