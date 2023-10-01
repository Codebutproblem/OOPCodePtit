
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

class TS {

    private String id,name,date;
    private double lt,th;

    public TS(int i, String name, String date, double lt, double th){
        id = i +"";
        if(id.length() < 2) id = "0"+id;
        this.id = "PH"+ id;
        this.name = name;
        try{
            SimpleDateFormat sdf_in = new SimpleDateFormat("dd/MM/yyyy");
            Date tmp = sdf_in.parse(date);
            SimpleDateFormat sdf_out = new SimpleDateFormat("dd/MM/yyyy");
            this.date = sdf_out.format(tmp);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        this.lt = lt;
        this.th = th;
    }
    public void chuanhoa(){
        String res = "";
        String[] arr = name.trim().split("\\s+");
        for(String s : arr){
            res += Character.toUpperCase(s.charAt(0));
            for(int i = 1; i < s.length(); i++){
                res += Character.toLowerCase(s.charAt(i));
            }
            res += " ";
        }
        name = res.substring(0,res.length()-1);
    }
    public double getThuong(){
        if(lt >= 8 && th >= 8) return 1;
        else if (lt >= 7.5 && th >= 7.5) return 0.5;
        else return 0;
    }
    public int getDiem(){
        int x = (int)Math.round((lt+th)/2 + getThuong());
        if(x > 10)return 10;
        else return x;
    }
    public String XepLoai(){
        int res = this.getDiem();
        if(res >= 9) return "Xuat sac";
        else if(res == 8) return "Gioi";
        else if(res == 7) return "Kha";
        else if(res == 6 || res == 5) return "Trung binh";
        else return "Truot";
    }
    public int Tuoi(){
        int nam = Integer.parseInt(date.substring(6));
        return 2021- nam;
    }
    @Override
    public String toString(){
        chuanhoa();
        return id + " "+ name + " "+ Tuoi() + " " + getDiem() + " " + XepLoai();
    }
    
}
public class J07053{
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = sc.nextInt();
        TS[] arr = new TS[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new TS(i+1,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble());
        }
        for(TS x : arr){
            System.out.println(x);
        }
    }
}
