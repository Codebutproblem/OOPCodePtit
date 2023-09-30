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
    private String id,ten,lop,email;

    public SV(String id, String ten, String lop, String email) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    
    @Override
    public int compareTo(SV o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + lop + " " + email;
    }
    
}
public class J05021 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        ArrayList<SV>arr = new ArrayList<>();
        while(sc.hasNext()){
            arr.add(new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        for(SV x : arr){
            System.out.println(x);
        }
    }
}
