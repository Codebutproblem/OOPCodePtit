import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class NV implements Comparable<NV>{
    private String id,ten,gioi_tinh,ngay_sinh,dia_chi,ma_so,ngay_ky;

    public NV(int i, String ten, String gioi_tinh, String ngay_sinh, String dia_chi, String ma_so, String ngay_ky) {
        this.id = String.format("%05d", i);
        this.ten = ten;
        this.gioi_tinh = gioi_tinh;
        this.ngay_sinh = ngay_sinh;
        this.dia_chi = dia_chi;
        this.ma_so = ma_so;
        this.ngay_ky = ngay_ky;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + gioi_tinh + " " + ngay_sinh + " " + dia_chi + " " + ma_so + " " + ngay_ky;
    }

    @Override
    public int compareTo(NV o) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        try {
            Date date1 = sdf.parse(this.ngay_sinh);
            Date date2 = sdf.parse(o.ngay_sinh);
            return date1.compareTo(date2);
        } catch (ParseException ex) {
            return -1;
        }
    }
    
}
public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NV[] arr = new NV[n];
        sc.nextLine();
        for(int  i = 0; i < n ;i++){
            arr[i] = new NV(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(arr);
        for(NV x : arr){
            System.out.println(x);
        }
    }
}
