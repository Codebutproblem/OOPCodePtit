
import java.util.Arrays;
import java.util.Scanner;

class TD{
    private String id,loai;
    private int chiSoCu,chiSoMoi;

    public TD(int cnt, String loai, int chiSoCu, int chiSoMoi) {
        this.id = String.format("KH%02d", cnt);
        this.loai = loai;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
    public int heSo(){
        switch(this.loai){
            case "KD":
                return 3;
            case "NN":
                return 5;
            case "TT":
                return 4;
            default:
                return 2;
        }
    }
    public int thanhTien(){
        return (this.chiSoMoi - this.chiSoCu)*this.heSo()*550;
    }
    public int phuTroi(){
        if(this.chiSoMoi - this.chiSoCu > 100){
            return this.thanhTien();
        }
        else if(this.chiSoMoi - this.chiSoCu >= 50){
            return (int)Math.ceil(this.thanhTien()*0.35);
        }
        else return 0;
    }
    public int tongThien(){
        return this.thanhTien()+this.phuTroi();
    }

    @Override
    public String toString() {
        return id + " " + this.heSo() + " " + this.thanhTien() + " " + this.phuTroi() + " " + this.tongThien();
    }
}

public class J05050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TD[] arr = new TD[n];
        for(int i = 0; i < n; i++){
            arr[i] = new TD(i+1,sc.next(),sc.nextInt(),sc.nextInt());
        }
        for(TD x : arr){
            System.out.println(x);
        }
    }
}
