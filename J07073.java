import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
class MH implements Comparable<MH>{
    private String id,ten,lt,th;
    private int so_tin;

    public MH(String id, String ten,int so_tin , String lt, String th) {
        this.id = id;
        this.ten = ten;
        this.so_tin = so_tin;
        this.lt = lt;
        this.th = th;
    }

    public String getTh() {
        return th;
    }
    
    @Override
    public int compareTo(MH o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + so_tin + " " + lt + " " + th;
    }
    
}
public class J07073 {
    public static void main(String[] args) throws ParseException, FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        MH[]arr = new MH[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            arr[i] = new MH(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(arr);
        for(MH x : arr){
            if(!x.getTh().equals("Truc tiep")){
                System.out.println(x);
            }
        }
    }
}
