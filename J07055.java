
import java.io.*;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;

class TS implements Comparable<TS>{
    private String id,ten;
    private double mon1,mon2,mon3;

    public TS(int i, String ten, double mon1, double mon2, double mon3) {
        this.id = "SV"+String.format("%02d", i);
        this.ten = ten;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }
    
    public void chuanhoa(){
        String res = "";
        String[] arr = ten.trim().split("\\s+");
        for(String s : arr){
            res += Character.toUpperCase(s.charAt(0));
            for(int i = 1; i < s.length(); i++){
                res += Character.toLowerCase(s.charAt(i));
            }
            res += " ";
        }
        ten = res.substring(0,res.length()-1);
    }
    public String XepLoai(){
        double x = this.Diem();
        if(x >= 8) return "GIOI";
        else if(x >= 6.5) return "KHA";
        else if(x >= 5) return "TRUNG BINH";
        else return "KEM";
    }
    public double Diem(){
        return (mon1*2.5 + mon2*3.5 + mon3*4)/10;
    }

    @Override
    public String toString() {
        chuanhoa();
        return id + " " + ten + " " + String.format("%.2f", Diem()) + " " +XepLoai();
    }

    @Override
    public int compareTo(TS o) {
        if(this.Diem() < o.Diem()){
            return 1;
        }
        else{
            return -1;
        }
    }
    
}
public class J07055 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        TS[] arr = new TS[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new TS(i+1,sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        }
        Arrays.sort(arr);
        
        for(TS x : arr){
            System.out.println(x);
        }
    }
}
