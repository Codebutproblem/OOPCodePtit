
import java.util.Arrays;
import java.util.Scanner;

class DH implements Comparable<DH>{
    private String ten,id;
    private int donGia,soLuong;
    public DH(String ten, String id, int donGia, int soLuong) {
        this.ten = ten;
        this.id = id;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    private String stt(){
        return id.substring(1,4);
    }
    private int giam(){
        if(id.charAt(id.length()-1) == '1') return (int)Math.ceil(donGia*soLuong*0.5);
        else return (int)Math.ceil(donGia*soLuong*0.3);
    }
    public int thanhTien(){
        return donGia*soLuong - giam();
    }

    @Override
    public String toString() {
        return ten + " " + id + " " + this.stt() + " " + this.giam() + " " + this.thanhTien();
    }

    @Override
    public int compareTo(DH o) {
        return this.stt().compareTo(o.stt());
    }
    
}

public class J05053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DH[] arr = new DH[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new DH(sc.nextLine(),sc.next(),sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(arr);
        for(DH x : arr){
            System.out.println(x);
        }
    }
}
