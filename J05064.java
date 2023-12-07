import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class CB{
    private String id,ten;
    private int lcb;

    public CB(String id, String ten, int lcb) {
        this.id = id;
        this.ten = ten;
        this.lcb = lcb;
    }

    public String getId() {
        return id;
    }
    
    public int heSo(){
        return Integer.parseInt(id.substring(2));
    }
    public int phuCap(){
        String begin = id.substring(0,2);
        switch(begin){
            case "HT":
                return 2000000;
            case "HP":
                return 900000;
            default:
                return 500000;
        }
    }
    public int luong(){
        return lcb*heSo() + phuCap();
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + heSo() + " " + phuCap() + " " + luong();
    }
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CB[] arr = new CB[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new CB(sc.nextLine(),sc.nextLine(),sc.nextInt());
        }
        HashMap<String,Integer>map = new HashMap<>();
        for(CB x : arr){
            String begin = x.getId().substring(0,2);
            if(begin.equals("HT") && map.containsKey(begin)){
                continue;
            }
            else if(begin.equals("HP") && map.containsKey(begin) && map.get(begin) >= 2){
                continue;
            }
            else{
                if(map.containsKey(begin)){
                    map.put(begin, map.get(begin)+1);
                }
                else{
                    map.put(begin, 1);
                }
                System.out.println(x);
            }
        }
    }
}
