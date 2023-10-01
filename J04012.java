
import java.io.*;
import java.math.BigInteger;
import java.util.*;
class Person{
    private String name;
    private int coBan,ngay;
    private String id;

    public Person(String name, int coBan, int ngay, String id) {
        this.name = name;
        this.coBan = coBan;
        this.ngay = ngay;
        this.id = id;
    }

    @Override
    public String toString() {
        
        int thang = coBan*ngay;
        int thuong;
        if(ngay >= 25){
            thuong = thang*20/100;
        }
        else if(ngay >= 22 && ngay < 25){
            thuong = thang*10/100;
        }
        else{
            thuong = 0;
        }
        int phucap;
        if(id.equals("GD")){
            phucap =250000;
        }
        else if(id.equals("PGD")){
            phucap =200000;
        }
        else if(id.equals("TP")){
            phucap =180000;
        }
        else{
            phucap =150000;
        }
        return "NV01 " + name + " " + thang + " " + thuong + " " + phucap + " " + (thang+thuong+phucap);
    }
    
}

public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person s = new Person(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.next());
        System.out.println(s);
    }
    
}
