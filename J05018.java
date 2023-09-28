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
class HS implements Comparable<HS>{
    
    private String id,ten;
    private double diemTB;

    public HS(int cnt, String ten, double[]arr) {
        this.id = "HS" + String.format("%02d", cnt);
        this.ten = ten;
        this.diemTB = arr[0]*2 + arr[1]*2 + arr[2]+arr[3]+arr[4]+arr[5]+arr[6] + arr[7]+arr[8]+arr[9];
        this.diemTB /= 12;
        this.diemTB = (double)Math.round(this.diemTB*10)/10;
    }
    public String xepLoai(){
        if(diemTB >= 9) return "XUAT SAC";
        else if(diemTB >= 8) return "GIOI";
        else if(diemTB >= 7) return "KHA";
        else if(diemTB >= 5) return "TB";
        return "YEU";
    }
    
    @Override
    public int compareTo(HS o) {
        if(this.diemTB != o.diemTB){
            if(this.diemTB < o.diemTB) return 1;
            else return -1;
        }
        else return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + String.format("%.1f", diemTB)+ " " +this.xepLoai();
    }
    
    
    
}
public class J05018 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HS[] arr = new HS[n];
        for(int i = 0; i < n; i++){
            double[] a = new double[10];
            sc.nextLine();
            String ten = sc.nextLine();
            for(int j = 0; j < 10; j++){
                a[j] = sc.nextDouble();
            }
            arr[i] = new HS(i+1,ten,a);
        }
        Arrays.sort(arr);
        for(HS x : arr){
            System.out.println(x);
        }
    }
}
