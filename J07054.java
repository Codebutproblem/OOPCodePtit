
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

class TS implements Comparable<TS>{
    private String id,ten;
    private double mon1,mon2,mon3;
    private int stt;

    public TS(int i, String ten, double mon1, double mon2, double mon3) {
        this.id = "SV"+String.format("%02d", i);
        this.ten = ten;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
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

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getStt() {
        return stt;
    }
    
    public String getId() {
        return id;
    }
    public double Diem(){
        return (mon1*3 + mon2*3 + mon3*2)/8;
    }

    @Override
    public String toString() {
        chuanhoa();
        return id + " " + ten + " " + String.format("%.2f", Diem()) + " " + stt;
    }

    @Override
    public int compareTo(TS o) {
        if(this.Diem() != o.Diem()){
            if(this.Diem() < o.Diem()){
                return 1;
            }
            else{
                return -1;
            }
        }
        else{
            return this.getId().compareTo(o.getId());
        }
    }
    
}
public class J07054 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        TS[] arr = new TS[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new TS(i+1,sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        }
        Arrays.sort(arr);
        HashMap<Double,Integer> map = new HashMap<>();
        int cnt = 1;
        for(int i = 0; i < n; i++){
            
            if(!map.containsKey(arr[i].Diem()) || map.get(arr[i].Diem()) > 1){
                arr[i].setStt(cnt);
            }
            else{
                arr[i].setStt(arr[i-1].getStt());
            }
            
            
            if(map.containsKey(arr[i].Diem())){
                int tmp = map.get(arr[i].Diem())+1;
                map.put(arr[i].Diem(), tmp);
            }
            else{
                map.put(arr[i].Diem(), 1);
            }
            cnt++;
        }
        for(TS x : arr){
            System.out.println(x);
        }
    }
}
