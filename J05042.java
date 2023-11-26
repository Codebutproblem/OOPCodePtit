
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class SV implements Comparable<SV>{
    private String name;
    private int ac,submit;

    public SV(String name, int ac, int submit) {
        this.name = name;
        this.ac = ac;
        this.submit = submit;
    }

    @Override
    public String toString() {
        return name + " " + ac + " " + submit;
    }

    @Override
    public int compareTo(SV o) {
        if(this.ac != o.ac){
            return o.ac - this.ac;
        }
        else if(this.submit != o.submit){
            return this.submit - o.submit;
        }
        return this.name.compareTo(o.name);
    }
    
}

public class J05042 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV[]arr = new SV[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new SV(sc.nextLine(),sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(arr);
        for(SV x : arr){
            System.out.println(x);
        }
    }
}
