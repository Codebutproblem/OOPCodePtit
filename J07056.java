
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

class KH implements Comparable<KH>{
    private String id,ten;
    private int dinh_muc,dau,cuoi;

    public KH(int i, String ten, String loai, int dau, int cuoi) {
        this.id = "KH" + String.format("%02d", i);
        this.ten = ten;
        if(loai.equals("A"))this.dinh_muc =  100;
        else if(loai.equals("B")) this.dinh_muc = 500;
        else this.dinh_muc = 200;
        this.dau = dau;
        this.cuoi = cuoi;
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
    public int getDinhMuc(){
        return Math.min(dinh_muc, cuoi-dau)*450;
    }
    public int getVuotDinhMuc(){
        return Math.max(0, cuoi-dau-dinh_muc)*1000;
    }
    public int getVAT(){
        return this.getVuotDinhMuc()*5/100;
    }
    public int getTong(){
        return this.getDinhMuc()+this.getVuotDinhMuc() + this.getVAT();
    }
    @Override
    public String toString() {
        chuanhoa();
        return id + " " + ten + " " + this.getDinhMuc() + " " + this.getVuotDinhMuc() + " " + this.getVAT() + " " + this.getTong();
    }

    @Override
    public int compareTo(KH o) {
        return o.getTong() - this.getTong();
    }
    
}
public class J07056 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        KH[] arr = new KH[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new KH(i+1,sc.nextLine(),sc.next(),sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(arr);
        for(KH x : arr){
            System.out.println(x);
        }
    }
}
