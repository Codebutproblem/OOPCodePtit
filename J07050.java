
import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
class Hang implements Comparable<Hang>{
    private String id,ten,nhom;
    private double mua,ban;

    public Hang(int i, String ten, String nhom, double mua, double ban) {
        this.id = i + "";
        if(this.id.length() < 2) this.id = "0"+this.id;
        this.id = "MH" + this.id;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }
    public double getLoiNhuan(){
        return ban - mua;
    }

    @Override
    public int compareTo(Hang o) {
        if(this.getLoiNhuan() < o.getLoiNhuan()){
            return 1;
        }
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + nhom + " " +String.format("%.2f", this.getLoiNhuan());
    }
    
}
public class J07050 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = sc.nextInt();
        Hang[] arr = new Hang[n];
        sc.nextLine();
        for(int i = 0; i < n ;i++){
            arr[i] = new Hang(i+1,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(arr);
        for(Hang x : arr){
            System.out.println(x);
        }
    }
}
