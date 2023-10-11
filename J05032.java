import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
class Person implements Comparable<Person>{
    private String ten,date;
    private SimpleDateFormat sdf;
    public Person(String ten, String date) {
        this.ten = ten;
        this.date = date;
        this.sdf = new SimpleDateFormat("dd/MM/yyyy");
    }

    @Override
    public int compareTo(Person o) {
        try {
            Date date1 = this.sdf.parse(this.date),date2 = this.sdf.parse(o.date);
            return date2.compareTo(date1);
        } catch (ParseException ex) {
            return -1;
        }
    }

    public String getTen() {
        return ten;
    }
    
}
public class J05032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] arr = new Person[n];
        for(int i = 0; i < n; i++){
            arr[i] = new Person(sc.next(),sc.next());
        }
        Arrays.sort(arr);
        System.out.println(arr[0].getTen());
        System.out.println(arr[arr.length-1].getTen());
        
    }
}
