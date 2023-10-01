
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Student{
    private String name,lop,ns;
    private double gpa;

    public Student(String name, String lop, String ns, double gpa) {
        this.name = name;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }
    public void chuanhoa(){
        StringBuilder sb = new StringBuilder(ns);
        if(sb.charAt(1) == '/'){
            sb.insert(0,'0');
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, '0');
        }
        ns = sb.toString();
    }

    @Override
    public String toString() {
        return  "B20DCCN001 "+ name + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
    
    
}

public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()));
        s.chuanhoa();
        System.out.println(s);
    }
    
}
