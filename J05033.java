
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class ThoiGian{
    private int gio,phut,giay;

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }

    public int getGiay() {
        return giay;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
    
}

public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ThoiGian[] a = new ThoiGian[n];
        for(int i = 0; i < n ;i++){
            a[i] = new ThoiGian(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(a, new Comparator<ThoiGian>(){
            @Override
            public int compare(ThoiGian a, ThoiGian b) {
                if(a.getGio() != b.getGio()){
                    return a.getGio()-b.getGio();
                }
                else if(a.getPhut() != b.getPhut()){
                    return a.getPhut()-b.getPhut();
                }
                else{
                    return a.getGiay()-b.getGiay();
                }
            }
        });
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }   
    
}
