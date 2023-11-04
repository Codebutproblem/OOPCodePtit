
import java.util.Arrays;
import java.util.Scanner;



class SV implements Comparable<SV>{
    private String stt;
    private String id,ten,lop,email,dn;

    public SV(int i,String id, String ten, String lop, String email, String dn) {
        this.stt = i+"";
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
        return stt + " " + id + " " + ten + " " + lop + " " + email + " " + dn;
    }
    @Override
    public int compareTo(SV o) {
        return this.id.compareTo(o.id);
    }
}


public class J05035 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV[]arr = new SV[n];
        sc.nextLine();
        for(int i = 0; i < n ;i++){
            arr[i] = new SV(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(arr);
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String s = sc.nextLine();
            for(SV x : arr){
                if(x.getDn().equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
