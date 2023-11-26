import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class NV implements Comparable<NV>{
    private String id, name,cv;
    private int lcb,nc;

    public NV(int cnt,String name, String cv, int lcb, int nc) {
        this.id = String.format("NV%02d", cnt);
        this.name = name;
        this.cv = cv;
        this.lcb = lcb;
        this.nc = nc;
    }

    public String getCv() {
        return cv;
    }
    
    public int getPhuCap(){
        switch(cv){
            case "GD":
                return 500;
            case "PGD":
                return 400;
            case "TP":
                return 300;
            case "KT":
                return 250;
            default:
                return 100;
        }
    }
    public int getLuongChinh(){
        return lcb*nc;
    }
    public int getTamUng(){
        if( 1f*(getPhuCap() + getLuongChinh())*2/3 < 25000 ){
            return (int)Math.round((1f*(getPhuCap() + getLuongChinh())*2/3000))*1000;
        }
        return 25000;
    }
    public int getThuNhap(){
        return getPhuCap()+getLuongChinh();
    }
    @Override
    public String toString() {
        return id + " " + name + " " + getPhuCap() + " " + getLuongChinh() + " " + getTamUng() + " " + (getPhuCap()+getLuongChinh()-getTamUng());
    }

    @Override
    public int compareTo(NV o) {
        if(this.getThuNhap() != o.getThuNhap()){
            return o.getThuNhap() - this.getThuNhap();
        }
        return this.id.compareTo(o.id);
    }
    
}
public class J05045 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NV[]arr = new NV[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new NV(i+1,sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(arr);
        for(NV x : arr){
            System.out.println(x);
        }
    }
}
