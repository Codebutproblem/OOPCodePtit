
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class DH implements Comparable<DH>{
    private String id,ten;
    private int sl,dg;
    private static HashMap<String,Integer>categories = new HashMap<>();

    public DH(String ten, int sl, int dg) {
        this.ten = ten;
        this.sl = sl;
        this.dg = dg;
        this.id = getId();
    }
    public int getChietKhau(){
        if(sl > 10){
            return (int)(dg*sl*0.05);
        }
        else if(sl >= 8){
            return (int)(dg*sl*0.02);
        }
        else if(sl >= 5){
            return (int)(dg*sl*0.01);
        }
        else{
            return 0;
        }
    }
    public String getId(){
        String[] s = ten.split("\\s+");
        String result = "" + Character.toUpperCase(s[0].charAt(0)) + Character.toUpperCase(s[1].charAt(0));
        if(categories.containsKey(result)){
            categories.put(result, categories.get(result)+1);
            return result + String.format("%02d", categories.get(result));
        }
        else{
            categories.put(result, 1);
            return result + String.format("%02d",1);
        }
    }
    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.getChietKhau() + " " + (dg*sl-this.getChietKhau());
    }

    @Override
    public int compareTo(DH o) {
        return o.getChietKhau() - this.getChietKhau();
    }
}

public class J05047 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DH[] arr = new DH[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new DH(sc.nextLine(),sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(arr);
        for(DH x : arr){
            System.out.println(x);
        }
    }
}
