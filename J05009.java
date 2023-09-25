import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class TS{
    private static double thukhoa = 0;
    private int id;
    private String ten,ns;
    private double diem;

    public TS(int id, String ten, String ns, double diem1, double diem2, double diem3) {
        this.id = id;
        this.ten = ten;
        this.ns = ns;
        this.diem = diem1 + diem2 + diem3;
        thukhoa = Math.max(thukhoa,this.diem);
    }
    public boolean check(){
        return thukhoa == diem;
    }
    @Override
    public String toString() {
        return id + " " + ten + " " + ns + " " + String.format("%.1f", diem);
    }
    
}
public class J05009  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TS[] arr = new TS[n];
        for(int  i = 0; i < n ;i++){
            sc.nextLine();
            arr[i] = new TS(i+1,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        }
        for(TS x : arr){
            if(x.check()){
                System.out.println(x);
            }
        }
    }
}
