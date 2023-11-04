import java.util.Arrays;
import java.util.Scanner;
class SP{
    private String id, sp,dv;
    private long gianhap,soluong;
    public SP(int i,String sp, String dv, long gianhap, long soluong) {
        this.id = String.format("MH%02d", i);
        this.sp = sp;
        this.dv = dv;
        this.gianhap = gianhap;
        this.soluong = soluong;
    }
    private long PVC(){
        return (long)Math.round((this.gianhap*this.soluong)*0.05);
    }
    private long TT(){
        return this.gianhap*this.soluong + PVC();
    }
    private long GB(){
        return (long)Math.round(this.TT()*1.02);
    }

    @Override
    public String toString() {
        return id + " " + sp + " " + dv + " " + PVC() + " " + TT() + " " + GB();
    }
    
}
public class J05036 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SP[]arr = new SP[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new SP(i+1,sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextLong());
        }
        for(SP x : arr){
            System.out.println(x);
        }
    }
}
