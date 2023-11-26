
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class DH{
    private String ten;
    private int sl,dg;
    private static HashMap<String,Integer>categories = new HashMap<>();

    public DH(String ten, int sl, int dg) {
        this.ten = ten;
        this.sl = sl;
        this.dg = dg;
    }
    public int getChietKhau(){
        if(sl > 10){
            return dg*sl*5/100;
        }
        else if(sl >= 8){
            return dg*sl*2/100;
        }
        else if(sl >= 5){
            return dg*sl/100;
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
        return this.getId() + " " + this.ten + " " + this.getChietKhau() + " " + (dg*sl-this.getChietKhau());
    }
}

public class J05046 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DH[] arr = new DH[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new DH(sc.nextLine(),sc.nextInt(),sc.nextInt());
        }
        for(DH x : arr){
            System.out.println(x);
        }
    }
}
