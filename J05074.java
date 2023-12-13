
import java.math.BigInteger;
import java.util.Scanner;

class SV{
    private String id,ten,lop,status;
    private int dcc;
    public SV(String id, String ten, String lop) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
    }
    public void setDcc(String s){
        this.dcc = 10;
        for(char x : s.toCharArray()){
            if(x == 'm') this.dcc -=1;
            if(x == 'v') this.dcc -=2;
        }
        this.dcc = Math.max(this.dcc, 0);
        if(this.dcc == 0) this.status = "KDDK";
        else this.status = "";
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return id + " " + ten + " " + lop + " " + dcc + " " + status;
    }
    
}

public class J05074{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SV[] arr = new SV[n];
        for(int i = 0; i < n; i++){
            arr[i] = new SV(sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        for(int i = 0; i < n; i++){
            String[] s = sc.nextLine().split("\\s+");
            for(SV x : arr){
                if(x.getId().equals(s[0])){
                    x.setDcc(s[1]);
                }
            }
        }
        for(SV x : arr){
            System.out.println(x);
        }
    }
}
