
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
class Teacher{
    private String id,name;
    private int basic,phucap;

    public Teacher(String id, String name, int basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
    }

    @Override
    public String toString() {
        int res = basic * Integer.parseInt(id.substring(2, 4));
        if(id.substring(0, 2).equals("HT")){
            res += 2000000;
            this.phucap = 2000000;
        }
        else if(id.substring(0, 2).equals("HP")){
            res += 900000;
            this.phucap = 900000;
        }
        else{
            res += 500000;
            this.phucap = 500000;
        }
        return id + " " + name + " "  +Integer.parseInt(id.substring(2, 4)) +" "+ phucap +" "+ res;
    }
    
}


public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher s = new Teacher(sc.nextLine(),sc.nextLine(),sc.nextInt());
        System.out.println(s);
    }
}
