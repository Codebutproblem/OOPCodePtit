
import java.util.*;



public class J03021 {  
    public static void main(String[] args) {
        int[]f = new int[256];
        f['A'] = f['B'] = f['C'] = 2;
        f['D'] = f['E'] = f['F'] = 3;
        f['G'] = f['H'] = f['I'] = 4;
        f['J'] = f['K'] = f['L'] = 5;
        f['M'] = f['N'] = f['O'] = 6;
        f['P'] = f['Q'] = f['R'] = f['S'] = 7;
        f['T'] = f['U'] = f['V'] = 8;
        f['W'] = f['X'] = f['Y'] = f['Z'] = 9;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String ans = "YES";
            int i = 0, j = s.length()-1;
            while(i < j){
                if(f[Character.toUpperCase(s.charAt(i))] != f[Character.toUpperCase(s.charAt(j))]){
                    ans = "NO";
                    break;
                }
                i += 1;
                j -= 1;
            }
            System.out.println(ans);
        }
    }
}
