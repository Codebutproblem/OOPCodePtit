import java.util.*;


public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        Integer[] a = new Integer[n] , b = new Integer[m];
        TreeSet<Integer> set_1 = new TreeSet<>();
        for(int i = 0; i < n; i++){
            set_1.add(sc.nextInt());
        }
        for(int i = 0; i < m; i++){
            set_1.add(sc.nextInt());
        }
        for(int x : set_1){
            System.out.print(x + " ");
        }
    }
}
