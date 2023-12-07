import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
class Team{
    private String id,ten;
    private int giaVe;

    public Team(String id, String ten, int giaVe) {
        this.id = id;
        this.ten = ten;
        this.giaVe = giaVe;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public int getGiaVe() {
        return giaVe;
    }
    
}
class Match{
    private String id;
    private int soLuong;

    public Match(String id, int soLuong) {
        this.id = id;
        this.soLuong = soLuong;
    }

    public String getId() {
        return id;
    }

    public int getSoLuong() {
        return soLuong;
    }
    
}
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Team[] teams = new Team[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            teams[i] = new Team(sc.nextLine(),sc.nextLine(),sc.nextInt());
        }
        int m = sc.nextInt();
        Match[] matchs = new Match[n];
        for(int i = 0; i < m; i++){
            matchs[i] = new Match(sc.next(),sc.nextInt());
        }
        Arrays.sort(matchs,new Comparator<Match>(){
            
            @Override
            public int compare(Match o1, Match o2) {
                Team a1 = null,a2 = null;
                for(int i = 0; i < n; i++){
                    if(o1.getId().substring(1,3).equals(teams[i].getId())){
                        a1 = teams[i];
                    }
                    if(o2.getId().substring(1,3).equals(teams[i].getId())){
                        a2 = teams[i];
                    }
                }
                if(o1.getSoLuong()*a1.getGiaVe() != o2.getSoLuong()*a2.getGiaVe()) return o2.getSoLuong()*a2.getGiaVe() - o1.getSoLuong()*a1.getGiaVe();
                return a1.getTen().compareTo(a2.getTen());
            }
        });
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matchs[i].getId().substring(1,3).equals(teams[j].getId())){
                    System.out.println(matchs[i].getId() + " " + teams[j].getTen() + " " + (matchs[i].getSoLuong()*teams[j].getGiaVe()));
                    break;
                }
            }
        }
    }
}
