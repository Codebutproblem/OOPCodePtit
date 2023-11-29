
import java.util.Arrays;
import java.util.Scanner;

class HH{
    private String id;
    int sl;

    public HH(String id, int sl) {
        this.id = id;
        this.sl = sl;
    }
    public int xuatHang(){
        if(this.id.startsWith("A")){
            return (int)(Math.round(this.sl*0.6));
        }
        else{
            return (int)(Math.round(this.sl*0.7));
        }
    }
    public int donGia(){
        if(this.id.endsWith("Y")){
            return 110000;
        }
        else{
            return 135000;
        }
    }
    public double phanTramThue(){
        if(this.id.startsWith("A") && this.id.endsWith("Y")) return 0.08;
        else if(this.id.startsWith("A") && this.id.endsWith("N")) return 0.11;
        else if(this.id.startsWith("B") && this.id.endsWith("Y")) return 0.17;
        else return 0.22;
    }

    @Override
    public String toString() {
        return id + " " + sl + " " + this.xuatHang() + " " + this.donGia() + " " + (this.donGia()*this.xuatHang()) +  " " + ((int)(this.donGia()*this.xuatHang()*this.phanTramThue()))  ;
    }
    
}

public class J05048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HH[] arr = new HH[n];
        for(int i = 0; i < n; i++){
            arr[i] = new HH(sc.next(),sc.nextInt());
        }
        for(HH x : arr){
            System.out.println(x);
        }
    }
}
