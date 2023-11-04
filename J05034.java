
import java.util.Arrays;
import java.util.Scanner;



class SV implements Comparable<SV>{
    private int stt;
    private String id,ten,lop,email,dn;

    public SV(int i,String id, String ten, String lop, String email, String dn) {
        this.stt = i+1;
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }

    public String getDn() {
        return dn;
    }
    
    @Override
    public String toString() {
        return  stt + " " + id + " " + ten + " " + lop + " " + email + " " + dn;
    }
    @Override
    public int compareTo(SV o) {
        return this.ten.compareTo(o.ten);
    }
}


public class J05034 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV[]arr = new SV[n];
        sc.nextLine();
        for(int i = 0; i < n ;i++){
            arr[i] = new SV(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(arr);
        int q = sc.nextInt();
        while(q-- > 0){
            String s = sc.next();
            for(int i = 0; i < n; i++){
                if(s.equals(arr[i].getDn())){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
