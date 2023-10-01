package OOP;

import java.util.Scanner;

 class thiSinh {
    private String maThiSinh, hoTen;
    private double diemToan, diemLy, diemHoa;

    public thiSinh() {
    }

    public thiSinh(String maThiSinh, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    double uuTien() {
        String kv = this.maThiSinh.substring(0, 3);
        if (kv.equals("KV1")) return 0.5;
        else if (kv.equals("KV2")) return 1.0;
        else return 2.5;
    }

    double diemThi() {
        return this.diemToan * 2 + this.diemLy + this.diemHoa;
    }

    @Override
    public String toString() {
        String trangThai;
        double tongDiem = diemThi() + uuTien();
        if (tongDiem >= 24.0) trangThai = "TRUNG TUYEN";
        else trangThai = "TRUOT";
        if (uuTien() == 1.0) {
            if (diemThi() == (int) diemThi()) {
                int dt = (int) diemThi();
                return this.maThiSinh + " " + this.hoTen + " " + 1 + " " + dt + " " + trangThai;
            } else {
                return this.maThiSinh + " " + this.hoTen + " " + 1 + " " + String.format("%.1f", diemThi()) + " " + trangThai;
            }
        } else {
            if (diemThi() == (int) diemThi()) {
                int dt = (int) diemThi();
                return this.maThiSinh + " " + this.hoTen + " " + String.format("%.1f", uuTien()) + " " + dt + " " + trangThai;
            } else {
                return this.maThiSinh + " " + this.hoTen + " " + String.format("%.1f", uuTien()) + " " + String.format("%.1f", diemThi()) + " " + trangThai;
            }
        }
    }
}

public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new thiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
}
