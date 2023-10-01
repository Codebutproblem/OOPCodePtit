
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Student{
    private String name,gender,date1,address,id,date2;

    public Student(String name, String gender, String date1, String address, String id, String date2) {
        this.name = name;
        this.gender = gender;
        this.date1 = date1;
        this.address = address;
        this.id = id;
        this.date2 = date2;
    }

    @Override
    public String toString() {
        return "00001 " + name + " " + gender + " " + date1 + " " + address + " " + id + " " + date2;
    }
    
}

public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        System.out.println(s);
    }
    
}
