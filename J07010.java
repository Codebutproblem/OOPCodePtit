
import java.io.*;
import java.math.BigInteger;
import java.util.*;
class SinhVien{
    private String id,ten,lop,date;
    private double gpa;

    public SinhVien(int i, String ten, String lop, String date, double gpa) {
        id = i + "";
        while(id.length() < 3){
            id = "0"+id;
        }
        this.id = "B20DCCN"+id;
        this.ten = ten;
        this.lop = lop;
        this.date = date;
        this.gpa = gpa;
        chuanhoa();
    }
    public void chuanhoa(){
        StringBuilder sb = new StringBuilder(date);
        if(sb.charAt(1) == '/')sb.insert(0, "0");
        if(sb.charAt(4) == '/')sb.insert(3, "0");
        this.date = sb.toString();
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + lop + " " + date + " " + String.format("%.2f",gpa);
    }
    
}
public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("SV.in"));
            int n = sc.nextInt();
            sc.nextLine();
            SinhVien[] arr = new SinhVien[n];
            for(int i = 0; i < n; i++){
                arr[i] = new SinhVien(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()));
            }
            for(SinhVien x : arr){
                System.out.println(x);
            }
        }
        catch(FileNotFoundException ex){
            
        }
    }
}
