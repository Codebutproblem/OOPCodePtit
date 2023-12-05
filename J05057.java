
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class TS{
    private String id,ten;
    private double toan,ly,hoa;

    public TS(String id, String ten, double toan, double ly, double hoa) {
        this.id = id;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public String uuTien(){
        switch(id.substring(0,3)){
            case "KV1":
                return "0.5";
            case "KV2":
                return "1";
            case "KV3":
                return "2.5";
            default:
                return "0";
        }
    }
    public double tongDiem(){
        return toan*2 + ly + hoa;
    }
    public String trangThai(){
        if(tongDiem()+ Double.parseDouble(uuTien()) >= 24){
            return "TRUNG TUYEN";
        }
        else{
            return "TRUOT";
        }
    }
    @Override
    public String toString() {
         if(tongDiem() == (int)tongDiem()){
            return id + " " + ten + " " +uuTien() + " " + (int)tongDiem() + " " + trangThai();
        }
        else{
            return id + " " + ten + " " +uuTien() + " " + String.format("%.1f", tongDiem()) + " " + trangThai();
        }
    }
    
}
public class J05057{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TS[]arr = new TS[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new TS(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        }
        for(TS x: arr){
            System.out.println(x);
        }
    }
}
