import java.util.*;

class PhanSo{
    private long a,b;

    public PhanSo(long a, long b) {
        this.a = a;
        this.b = b;
    }
    public static long gcd(long a,long b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    public static long lcm(long a,long b){
        return a/gcd(a,b)*b;
    }
    public static PhanSo Add(PhanSo x, PhanSo y){
        long l = lcm(x.b,y.b);
        long tu =l/x.b*x.a + l/y.b*y.a;
        long mau = l;
        long k = gcd(tu,mau);
        tu /= k;
        mau /= k;
        return new PhanSo(tu,mau);
    }

    @Override
    public String toString() {
        return a + "/" + b;
    }
    
}

public class J04004 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(sc.nextInt(),sc.nextInt());
        PhanSo b = new PhanSo(sc.nextInt(),sc.nextInt());
        System.out.println(PhanSo.Add(a,b));
    }
}
