import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
class DH{
    private String id,tenHang;
    private long soLuong,donGia;
    private double thue;

    public DH(String id, long soLuong) {
        this.id = id;
        this.soLuong = soLuong;
        switch(id.charAt(0)){
            case 'X':
                donGia = 128000;
                thue = 0.03;
                break;
            case 'D':
                donGia = 11200;
                thue = 0.035;
                break;
            case 'N':
                donGia = 9700;
                thue = 0.02;
                break;
        }
        switch(this.id.substring(3)){
            case "BP":
                tenHang = "British Petro";
                break;
            case "ES":
                tenHang = "Esso";
                break;
            case "SH":
                tenHang = "Shell";
                break;
            case "CA":
                tenHang = "Castrol";
                break;
            case "MO":
                tenHang = "Mobil";
                break;
            default:
                tenHang = "Trong Nuoc";
                thue = 0;
        }
    }
    public long getThue(){
        return (long)(soLuong*donGia*thue);
    }

    @Override
    public String toString() {
        return id + " " + tenHang + " " + donGia + " " + getThue() + " " +(soLuong*donGia + getThue());
    }
    
    
}
public class J05067 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DH[] arr = new DH[n];
        for(int i = 0; i < n; i++){
            arr[i] = new DH(sc.next(),sc.nextLong());
        }
        for(DH x : arr){
            System.out.println(x);
        }
    }
}
