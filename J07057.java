
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
    private double diem;

    public TS(int i, String ten, double diem, String dt, int kv) {
        this.id = "TS" + String.format("%02d", i);
        this.ten = ten;
        this.diem = diem;
        if(! dt.equals("Kinh")){
            this.diem += 1.5;
        }
        if(kv == 1) this.diem += 1.5;
        if(kv == 2) this.diem += 1;
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

    public double getDiem() {
        return diem;
    }
    
    public String trangThai(){
        if(diem >= 20.5) return "Do";
        else return "Truot";
    }
    @Override
    public int compareTo(TS o) {
        if(this.getDiem() != o.getDiem()){
            if(this.getDiem() < o.getDiem()){
                return 1;
            }
            else{
                return -1;
            }
        }
        else{
            return this.id.compareTo(o.id);
        }
    }

    @Override
    public String toString() {
        chuanhoa();
        return id + " " + ten + " " + String.format("%.1f", diem) + " " + this.trangThai();
    }
    
    
}
public class J07057 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        TS[] arr = new TS[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            arr[i] = new TS(i+1,sc.nextLine(),Double.parseDouble(sc.nextLine()),sc.nextLine(),Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(arr);
        
        for(TS x : arr){
            System.out.println(x);
        }
    }
}
