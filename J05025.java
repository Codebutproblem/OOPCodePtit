import java.io.*;
import java.util.*;


class GV implements Comparable<GV>{
    private String id,ten,mon;
    public GV(int cnt, String ten, String mon) {
        this.id = String.format("GV%02d", cnt);
        this.ten = ten;
        this.mon = "";
        String[]arr = mon.split("\\s+");
        for(String x : arr){
            this.mon += Character.toUpperCase(x.charAt(0));
        }
    }
    
    public String Ten(){
        String[]arr = ten.split("\\s+");
        return arr[arr.length-1];
    }
    
    @Override
    public String toString() {
        return id + " " + ten + " " + mon;
    }
    
    @Override
    public int compareTo(GV o) {
        if(!this.Ten().equals(o.Ten())) return this.Ten().compareTo(o.Ten());
        return this.id.compareTo(o.id);
    }
    
}
public class J05025{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GV[]arr = new GV[n];
        sc.nextLine();
        for(int i = 0; i < n ;i++){
            arr[i] = new GV(i+1,sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(arr);
        for(GV x : arr){
            System.out.println(x);
        }
    }
}
