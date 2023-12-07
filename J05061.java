import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class TS implements Comparable<TS>{
    private String id,name,date;
    private double lt,th;

    public TS(int cnt, String name, String date, double lt, double th) {
        this.id = String.format("PH%02d", cnt);
        this.name = name;
        this.date = date;
        this.lt = lt;
        this.th = th;
    }
    public double diemCong(){
        if(lt >= 8 && th >= 8) return 1;
        else if(lt >= 7.5 && th >= 7.5) return 0.5;
        else return 0;
    }
    public int diem(){
        if((lt+th)/2 + diemCong() >= 10) return 10;
        return (int)Math.round((lt+th)/2 + diemCong());
    }
    public String xepLoai(){
        if(diem() >= 9) return "Xuat sac";
        else if(diem() >= 8) return "Gioi";
        else if(diem() >= 7) return "Kha";
        else if(diem() >= 5) return "Trung binh";
        else return "Truot";
    }
    public int tuoi(){
        return 2021 - Integer.parseInt(date.split("/")[2]);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + tuoi() + " " + diem() + " " + xepLoai();
    }

    @Override
    public int compareTo(TS o) {
        if(this.diem() != o.diem()) return o.diem() - this.diem();
        return this.id.compareTo(o.id);
    }
    
}

public class J05061{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TS[] arr = new TS[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new TS(i+1,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble());
        }
        Arrays.sort(arr);
        for(TS x : arr){
            System.out.println(x);
        }
    }
}
