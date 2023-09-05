import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

class Khach{
    private String ma_khach,ten_khach,ma_phong,ngay_den,ngay_di;

    public Khach(int i, String ten_khach, String ma_phong, String ngay_den, String ngay_di) {
        this.ma_khach = i+"";
        if(this.ma_khach.length() < 2){
            this.ma_khach = "0"+this.ma_khach;
        }
        this.ma_khach = "KH" + this.ma_khach;
        this.ten_khach = ten_khach;
        this.ma_phong = ma_phong;
        this.ngay_den = ngay_den;
        this.ngay_di = ngay_di;
    }
    public int getNgay(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date date = sdf.parse(ngay_den);
            LocalDate date1 = LocalDate.of(date.getYear()+1900, date.getMonth()+1,date.getDate());
            date = sdf.parse(ngay_di);
            LocalDate date2 = LocalDate.of(date.getYear()+1900, date.getMonth()+1,date.getDate());
            Period period = Period.between(date1, date2);
            return period.getDays();
        }
        catch(ParseException e){
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public String toString() {
        return  ma_khach + " " + ten_khach + " " + ma_phong + " " + getNgay();
    }
    
}
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = sc.nextInt();
        Khach[] arr = new Khach[n];
        sc.nextLine();
        for(int i = 0; i < n ;i++){
            arr[i] = new Khach(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(arr, new Comparator<Khach>(){
            @Override
            public int compare(Khach a, Khach b) {
                return b.getNgay()- a.getNgay();
            }
        });
        for(Khach x : arr){
            System.out.println(x);
        }
    }
}
