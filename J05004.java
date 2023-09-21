import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
class SV{
    private String id,ten,lop,date;
    private double gpa;

    public SV(int i, String ten, String lop, String date, double gpa) {
        this.id = "B20DCCN" + String.format("%03d", i);
        this.ten = ten;
        this.lop = lop;
        this.date = date;
        this.gpa = gpa;
    }
    public void chuanhoa(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try{
            Date day = sdf.parse(date);
            date = sdf.format(day);
        }
        catch(ParseException ex){
            ex.printStackTrace();
        }
        StringBuilder sb = new StringBuilder("");
        String[] arr = ten.trim().split("\\s+");
        for(String s : arr){
            sb.append(Character.toUpperCase(s.charAt(0)));
            for(int i = 1; i < s.length(); i++){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            sb.append(" ");
        }
        ten = sb.substring(0, sb.length()-1);
    }

    @Override
    public String toString() {
        chuanhoa();
        return id + " " + ten + " " + lop + " " + date + " " + String.format("%.2f", gpa);
    }
    
}
public class J05004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV[] arr = new SV[n];
        for(int  i = 0; i < n ;i++){
            sc.nextLine();
            arr[i] = new SV(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
        }
        for(SV x : arr){
            System.out.println(x);
        }
    }
}
