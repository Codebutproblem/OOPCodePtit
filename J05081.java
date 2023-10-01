
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Hang{
    private String id,ten_hang,don_vi;
    private int gia_mua,gia_ban;

    public Hang(int i,String ten_hang, String don_vi, int gia_mua, int gia_ban) {
        id = i +"";
        while(id.length() < 3){
            id = "0"+id;
        }
        id = "MH"+id;
        this.ten_hang = ten_hang;
        this.don_vi = don_vi;
        this.gia_mua = gia_mua;
        this.gia_ban = gia_ban;
    }
    public int loi_nhuan(){
        return gia_ban - gia_mua;
    }

    @Override
    public String toString() {
        return id + " " + ten_hang + " " + don_vi + " " + gia_mua + " " + gia_ban + " " +loi_nhuan();
    }
    
}
class Sort_by_Loi_Nhuan implements Comparator<Hang>{

    @Override
    public int compare(Hang o1, Hang o2) {
        return o2.loi_nhuan()-o1.loi_nhuan();
    }
    
}

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hang[]list = new Hang[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            list[i] = new Hang(i+1,sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(list, new Sort_by_Loi_Nhuan());
        for(int i = 0; i < n; i++){
            System.out.println(list[i]);
        }
    }   
    
}
