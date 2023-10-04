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
class SV{
    private String id,ten,lop,email;

    public SV(String id, String ten, String lop, String email) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    public String getNganh() {
        if(id.contains("DCKT")) return "Ke toan";
        if(id.contains("DCVT")) return "Vien thong";
        if(id.contains("DCDT")) return "Dien tu";
        if(id.contains("DCCN") && lop.charAt(0) != 'E') return "Cong nghe thong tin";
        if(id.contains("DCAT") && lop.charAt(0) != 'E') return "An toan thong tin";
        return "";
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + lop + " " + email;
    }
    
}
public class J05024  {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV[] arr = new SV[n];
        sc.nextLine();
        for(int i = 0; i < n ;i++){
            arr[i] = new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String nganh = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() + ":");
            for(SV x : arr){
                if(x.getNganh().equalsIgnoreCase(nganh)){
                    System.out.println(x);
                }
            }
        }
        
    }
}
