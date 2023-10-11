import java.util.*;
import java.io.*;
class SV implements Comparable<SV>{
    private String id,ten,lop;
    private double diem1,diem2,diem3;

    public SV(String id, String ten, String lop, double diem1, double diem2, double diem3) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + lop + String.format(" %.1f", diem1)+String.format(" %.1f", diem2) +String.format(" %.1f", diem3);
    }

    @Override
    public int compareTo(SV o) {
        return this.id.compareTo(o.id);
    }
    
}
public class J05030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV[] arr = new SV[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            System.out.println((i+1) + " " + arr[i]);
        }
        
    }
}
