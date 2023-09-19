import java.util.*;


public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1; k <= t; k++){
            int n = sc.nextInt();
            LinkedHashMap<Integer,Integer>map = new LinkedHashMap<>();
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                if (map.containsKey(x)){
                    int tmp = map.get(x);
                    map.put(x, tmp+1);
                }
                else{
                    map.put(x, 1);
                }
            }
            System.out.println("Test " + k + ":");
            Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
            for (Map.Entry<Integer, Integer> entry : entrySet) {
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
        }
    }
}
