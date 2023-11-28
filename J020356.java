
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class J020356 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        int tmp = s;
        if(s == 0 || s > 9*n){
            System.out.println("-1 -1");
            return;
        }
        int[] min_num = new int[n];
        for(int i = n-1; i >= 0; i--){
            if(s > 9){
                min_num[i] = 9;
                s -= 9;
            }
            else{
                min_num[i] = s-1;
                min_num[0] += 1;
                break;
            }
        }
        for(int x : min_num){
            System.out.print(x+"");
        }
        System.out.print(" ");
        s = tmp;
        int[] max_num = new int[n];
        for(int i = 0; i < n; i++){
            if(s > 9){
                max_num[i] = 9;
                s -=9;
            }
            else{
                max_num[i] = s;
                break;
            }
        }
        for(int x : max_num){
            System.out.print(x+"");
        }
    }
}
