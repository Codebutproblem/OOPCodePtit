
import java.io.*;
import java.math.BigInteger;
import java.util.*;
class phanSo{
    private long tu,mau;

    public phanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }    
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    public static long lcm(long a,long b){
        return a/gcd(a,b)*b;
    }
    public void rutGon(){
        long k = gcd(tu,mau);
        tu = tu/k;
        mau = mau/k;
    }
    public phanSo phepTinh_1(phanSo a){
        long k = lcm(this.mau,a.getMau());
        long x = k/this.mau*this.tu + k/a.getMau()*a.getTu();
        phanSo res = new phanSo(x*x,k*k);
        res.rutGon();
        return res;
    }
    public phanSo phepTinh_2(phanSo a, phanSo b){
        phanSo res = new phanSo(this.tu*a.getTu()*b.getTu(),this.mau*a.getMau()*b.getMau());
        res.rutGon();
        return res;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
    
}
public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            phanSo a = new phanSo(sc.nextLong(),sc.nextLong());
            phanSo b = new phanSo(sc.nextLong(),sc.nextLong());
            phanSo c = a.phepTinh_1(b);
            phanSo d = a.phepTinh_2(b, c);
            System.out.println(c +" " + d);
        }
    }
}
