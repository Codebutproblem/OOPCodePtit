
import java.math.BigInteger;
import java.util.Scanner;

class HH{
    private String id,ten,loai;

    public HH(String id, String ten, String loai) {
        this.id = id;
        this.ten = ten;
        this.loai = loai;
    }
    
    public double laiSuat(){
        switch(loai){
            case "A":
                return 0.08;
            case "B":
                return 0.05;
            default :
                return 0.02;
        }
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
}
class DH{
    public String id;
    private int nhap,giaNhap,ban;
    private HH hangHoa;

    public DH(String id, int nhap, int giaNhap, int ban, HH[] arr) {
        this.id = id;
        this.nhap = nhap;
        this.giaNhap = giaNhap;
        this.ban = ban;
        for(HH x : arr){
            if(x.getId().equals(this.id)){
                this.hangHoa = x;
                break;
            }
        }
    }
    
    public int tongNhap(){
        return nhap*giaNhap;
    }
    
    public int tongXuat(){
        return (int)( ban*giaNhap*(1+hangHoa.laiSuat()));
    }
    
    @Override
    public String toString() {
        return id + " " + hangHoa.getTen() + " " + tongNhap() + " " + tongXuat();
    }
    
    
}
public class J05076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HH[] hangHoa = new HH[n];
        for(int i = 0; i < n; i++){
            hangHoa[i] = new HH(sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        int m = sc.nextInt();
        DH[] donHang = new DH[m];
        for(int i = 0; i< m; i++){
            donHang[i] = new DH(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),hangHoa);
        }
        for(DH x : donHang){
            System.out.println(x);
        }
    }
}
