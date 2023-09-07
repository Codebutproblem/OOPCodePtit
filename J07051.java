
import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import java.util.*;
class Khach implements Comparable<Khach>{
    private String ma_khach,ten,phong,ngay_den,ngay_di;
    private int gia;

    public Khach(int i,String ten, String phong, String ngay_den, String ngay_di, int gia) {
        this.ma_khach = i+"";
        if(this.ma_khach.length() < 2){
            this.ma_khach = "0"+this.ma_khach;
        }
        this.ma_khach = "KH" + this.ma_khach;
        this.ten = ten.trim();
        this.phong = phong.trim();
        this.ngay_den = ngay_den;
        this.ngay_di = ngay_di;
        this.gia = gia;
    }
    
    public int getNgay(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date date = sdf.parse(ngay_den);
            LocalDate date1 = LocalDate.of(date.getYear()+1900, date.getMonth()+1,date.getDate());
            date = sdf.parse(ngay_di);
            LocalDate date2 = LocalDate.of(date.getYear()+1900, date.getMonth()+1,date.getDate());
            Period period = Period.between(date1, date2);
            return (int) ChronoUnit.DAYS.between(date1,date2) + 1;
        }
        catch(ParseException e){
            e.printStackTrace();
            return 0;
        }
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
    public int getThanhTien(){
        if(phong.charAt(0) == '1'){
            return getNgay()*25 + gia;
        }
        else if(phong.charAt(0) == '2'){
            return getNgay()*34 + gia;
        }
        else if(phong.charAt(0) == '3'){
            return getNgay()*50 + gia;
        }
        else{
            return getNgay()*80 + gia;
        }
    }
    @Override
    public int compareTo(Khach o) {
        return o.getThanhTien()- this.getThanhTien();
    }

    @Override
    public String toString() {
        chuanhoa();
        return  ma_khach + " " + ten + " " + phong + " " + this.getNgay() + " " + this.getThanhTien();
    }
    
}
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        Khach[] arr = new Khach[n];
        sc.nextLine();
        for(int i = 0; i < n ;i++){
            arr[i] = new Khach(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(arr);
        for(Khach x : arr){
            System.out.println(x);
        }
    }
}
