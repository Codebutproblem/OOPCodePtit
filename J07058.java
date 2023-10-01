import java.io.*;
import java.math.BigInteger;
import java.util.*;

class MonHoc{
    private String ma,ten,hinh_thuc;

    public MonHoc(String ma, String ten, String hinh_thuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinh_thuc = hinh_thuc;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinh_thuc;
    }
    
}

public class J07058 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = sc.nextInt();
            sc.nextLine();
            MonHoc[] arr = new MonHoc[n];
            for(int i = 0; i < n; i++){
                arr[i] = new MonHoc(sc.nextLine(),sc.nextLine(),sc.nextLine());
            }
            Arrays.sort(arr, new Comparator<MonHoc>(){
                @Override
                public int compare(MonHoc o1, MonHoc o2) {
                    return o1.getMa().compareTo(o2.getMa());
                }
                
            });
            for(MonHoc x : arr){
                System.out.println(x);
            }
        }
        catch(FileNotFoundException ex){
            
        }
        
    }   
    
}
