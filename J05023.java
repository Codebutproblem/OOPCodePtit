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

    public String getLop() {
        return lop;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public int compareTo(SV o) {
        if(!this.lop.equals(o.lop))return this.lop.compareTo(o.lop);
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + lop + " " + email;
    }
    
}
public class J05023 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV[] arr = new SV[n];
        sc.nextLine();
        for(int i = 0; i < n ;i++){
            arr[i] = new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        int t = sc.nextInt();
        while(t-- > 0){
            String khoa = sc.next();
            System.out.println("DANH SACH SINH VIEN KHOA " + khoa+":");
            for(SV x : arr){
                if(x.getLop().substring(1,3).equals(khoa.substring(2))){
                    System.out.println(x);
                }
            }
        }
        
    }
}
