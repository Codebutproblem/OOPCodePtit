
import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Subject{
    private String id,ten;
    private int sotin;

    public Subject(String id, String ten, int sotin) {
        this.id = id;
        this.ten = ten;
        this.sotin = sotin;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + sotin;
    }
    
}
public class J07034 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        Subject[] arr = new Subject[n];
        sc.nextLine();
        for(int i = 0; i < n ;i++){
            arr[i] = new Subject(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(arr, new Comparator<Subject>(){
            @Override
            public int compare(Subject a, Subject b) {
                return a.getTen().compareTo(b.getTen());
            }
        });
        for(Subject x : arr){
            System.out.println(x);
        }
    }
}
