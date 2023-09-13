
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
    private static double diem_chuan;
    private String ma,ten,trang_thai;
    private double toan,ly,hoa;

    public TS(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten.trim();
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
     public void chuanhoa(){
        String res = "";
        String[] arr = ten.split("\\s+");
        for(String s : arr){
            res += Character.toUpperCase(s.charAt(0));
            for(int i = 1; i < s.length(); i++){
                res += Character.toLowerCase(s.charAt(i));
            }
            res += " ";
        }
        ten = res.substring(0,res.length()-1);
    }
    public double getUutien(){
        String t = this.ma.substring(0,3);
        if(t.equals("KV1")) return 0.5;
        else if(t.equals("KV2")) return 1;
        else return 2.5;
    }
    public double getDiem(){
        return (toan*2+ly+hoa)+ getUutien();
    }
    
    public String getTrang_thai() {
        if(this.getDiem() >= diem_chuan) return "TRUNG TUYEN";
        else return "TRUOT";
    }

    public static void setDiem_chuan(double diem_chuan) {
        TS.diem_chuan = diem_chuan;
    }
    
    public String getMa() {
        return ma;
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
            return this.getMa().compareTo(o.getMa());
        }
    }
    @Override
    public String toString() {
        chuanhoa();
        return ma + " " + ten + " " + (new DecimalFormat()).format(getUutien()) + " " + (new DecimalFormat()).format(getDiem()) + " " +getTrang_thai();
    }
    
}
public class J07052 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        TS[] arr = new TS[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new TS(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        }
        Arrays.sort(arr);
        int k = sc.nextInt();
        TS.setDiem_chuan(arr[k-1].getDiem());
        System.out.println(String.format("%.1f", arr[k-1].getDiem()));
        for(TS x: arr){
            System.out.println(x);
        }
    }
}
