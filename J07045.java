
import java.io.*;
import java.math.BigInteger;
import java.util.*;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String kyhieu,loai;
    private int gia;
    private double phi;
    public LoaiPhong(String s){
        String[] arr = s.split("\\s+");
        this.kyhieu = arr[0];
        this.loai = arr[1];
        this.gia = Integer.parseInt(arr[2]);
        this.phi = Double.parseDouble(arr[3]);
    }
    
    @Override
    public int compareTo(LoaiPhong other) {
        return this.loai.compareTo(other.loai);
    }
    
    
    public String getLoai() {
        return loai;
    }

    @Override
    public String toString() {
        return kyhieu + " " + loai + " " + gia + " " + phi;
    }
    
    
}
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    public static void main822678(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
