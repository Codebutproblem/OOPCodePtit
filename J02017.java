import java.util.*;


public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= 1;
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer>arr = new ArrayList<>();
            for(int i = 0; i < n; i++){
                Integer x = sc.nextInt();
                if (arr.isEmpty() || (arr.get(arr.size()-1)+x)%2 == 1){
                    arr.add(x);
                }
                else{
                    arr.remove(arr.size()-1);
                }
            }
            System.out.println(arr.size());
        }
    }
}
