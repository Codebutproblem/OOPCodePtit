import java.util.*;
import java.io.*;
class DN implements Comparable<DN>{
    private String id,ten;
    private int so_luong;

    public DN(String id, String ten, int so_luong) {
        this.id = id;
        this.ten = ten;
        this.so_luong = so_luong;
    }

    @Override
    public int compareTo(DN o) {
        if(this.so_luong != o.so_luong){
            return o.so_luong - this.so_luong;
        }
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + so_luong;
    }
    
}

public class J05028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DN[] arr = new DN[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new DN(sc.nextLine(),sc.nextLine(),sc.nextInt());
        }
        Arrays.sort(arr);
        for (DN x : arr){
            System.out.println(x);
        }
    }
}
