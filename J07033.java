import java.io.*;
import java.math.BigInteger;
import java.util.*;

class SinhVien{
    private String id,ten,lop,email;

    public SinhVien(String id, String ten, String lop, String email) {
        this.id = id;
        this.ten = ten.trim();
        this.lop = lop;
        this.email = email;
    }
    
    public void chuanhoa(){
        String res = "";
        String[] arr = ten.split("\\s+");
        for(String s : arr){
            res += Character.toUpperCase(s.charAt(0));
            for(int i = 1; i < s.length(); i++){
                res += Character.toLowerCase(s.charAt(i));
            }
            res += " ";
        }
        ten = res.substring(0,res.length()-1);
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        chuanhoa();
        return id + " " + ten + " " + lop + " " + email;
    }
    
}
public class J07033 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        SinhVien[] arr = new SinhVien[n];
        sc.nextLine();
        for(int i = 0; i < n ;i++){
            arr[i] = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a, SinhVien b) {
                return a.getId().compareTo(b.getId());
            }
        });
        for(SinhVien x : arr){
            System.out.println(x);
        }
    }
}
