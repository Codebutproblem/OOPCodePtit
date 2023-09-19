import java.util.*;


public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            System.out.print("Buoc " + (i+1) + ": ");
            int min_val = a[i],id = i;
            for(int j = i+1; j < n; j++){
                if(a[j] < min_val){
                    min_val = a[j];
                    id = j;
                }
            }
            int tmp = a[id];
            a[id] = a[i];
            a[i] = tmp;
            for(int j = 0; j < n; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }
    }
}
