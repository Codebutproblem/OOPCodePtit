
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class SV{
    private String id;
    private String ten;
    private double tb;
    
    
    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public double getTb() {
        return tb;
    }
    
    public SV(int cnt,String ten, double tb) {
        this.id = String.format("HS%02d", cnt);
        this.ten = ten;
        this.tb = tb;
    }
    public String xepLoai(){
        if(tb >= 9) return "Gioi";
        else if(tb >= 7) return "Kha";
        else if(tb >= 5) return "Trung Binh";
        else return "Yeu";
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + String.format("%.1f", tb) + " " + this.xepLoai();
    }
    
}

public class J05054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV[] arr = new SV[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new SV(i+1,sc.nextLine(),sc.nextDouble());
        }
        HashMap<Double,Integer>map = new HashMap<>();
        int cnt = 1;
        ArrayList<Double>listTb = new ArrayList<>();
        for(SV x : arr){
            listTb.add(x.getTb());
        }
        Collections.sort(listTb, Collections.reverseOrder());
        for(double x : listTb){
            if(!map.containsKey(x)){
                map.put(x, cnt);
            }
            cnt++;
        }
        for(SV x : arr){
            System.out.println(x + " " + map.get(x.getTb()));
        }
    }
}
