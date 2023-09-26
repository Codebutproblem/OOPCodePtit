import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class MH implements Comparable<MH>{
    private int id;
    private String ten,loai;
    private double mua,ban;

    public MH(int id, String ten,String loai, double mua, double ban) {
        this.id = id;
        this.ten = ten;
        this.loai = loai;
        this.mua = mua;
        this.ban = ban;
    }
    public double loiNhuan(){
        return ban - mua;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + loai + " " + String.format("%.2f", this.loiNhuan());
    }

    @Override
    public int compareTo(MH o) {
        if(this.loiNhuan() < o.loiNhuan()) return 1;
        else return -1;
    }
    
}
public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MH[] arr = new MH[n];
        for(int  i = 0; i < n ;i++){
            sc.nextLine();
            arr[i] = new MH(i+1,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble());
        }
        Arrays.sort(arr);
        for(MH x : arr){
            System.out.println(x);
        }
    }
}
