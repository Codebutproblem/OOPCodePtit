import java.util.*;


public class J02005  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        Integer[] a = new Integer[n] , b = new Integer[m];
        TreeSet<Integer> set_1 = new TreeSet<>();
        TreeSet<Integer> set_2 = new TreeSet<>();
        for(int i = 0; i < n; i++){
            set_1.add(sc.nextInt());
        }
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            if(set_1.contains(x)){
                set_2.add(x);
            }
        }
        for(int x : set_2){
            System.out.print(x + " ");
        }
    }
}
