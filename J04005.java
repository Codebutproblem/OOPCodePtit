import java.util.*;

class PhanSo{
    private String ten,ngay_sinh;
    private double a,b,c;

    public PhanSo(String ten, String ngay_sinh, double a, double b, double c) {
        this.ten = ten;
        this.ngay_sinh = ngay_sinh;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return ten + " " + ngay_sinh + " " + String.format("%.1f", a+b+c);
    }
    
}

public class J04005  {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new PhanSo(sc.nextLine(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
    }
}
