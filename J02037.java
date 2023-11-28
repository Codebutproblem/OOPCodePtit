
import java.util.ArrayList;
import java.util.Scanner;


public class J02037{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            int chan = 0,le = 0;
            String[] s = sc.nextLine().split("\\s+");
            for(String x : s){
                if(Integer.parseInt(x)%2 == 0){
                    chan++;
                }
                else{
                    le++;
                }
            }
            if(s.length%2 == 1){
                if(le > chan){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                if(le < chan){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
