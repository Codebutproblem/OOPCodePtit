
import java.io.*;
import java.math.BigInteger;
import java.util.*;

class DN{
    private String id,ten;
    private int soLuong;

    public DN(String id, String ten, int soLuong) {
        this.id = id;
        this.ten = ten;
        this.soLuong = soLuong;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return id + " " + ten + " " + soLuong;
    }
    
}
public class J07037 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt();
        DN[] arr = new DN[n];
        sc.nextLine();
        for(int i = 0; i < n ;i++){
            arr[i] = new DN(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(arr, new Comparator<DN>(){
            @Override
            public int compare(DN a, DN b) {
                return a.getId().compareTo(b.getId());
            }
        });
        for(DN x : arr){
            System.out.println(x);
        }
    }
}
