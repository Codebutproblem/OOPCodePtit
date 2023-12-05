
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class VDV{
    private String id,name,date,start,end;

    public VDV(int cnt, String name, String date, String start, String end) {
        this.id = String.format("VDV%02d", cnt);
        this.name = name;
        this.date = date;
        this.start = start;
        this.end = end;
    }

    
    public int uuTien(){
        int tuoi = 2021 - Integer.parseInt(date.substring(6));
        if(tuoi >= 32){
            return 3;
        }
        else if(tuoi >= 25){
            return 2;
        }
        else if(tuoi >= 18){
            return 1;
        }
        else{
            return 0;
        }
    }
    public long realRecord(){
        String[] startArray = start.split(":");
        String[] endArray = end.split(":");
        long secondStart = Integer.parseInt(startArray[0])*3600 + Integer.parseInt(startArray[1])*60 + Integer.parseInt(startArray[2]);
        long secondEnd = Integer.parseInt(endArray[0])*3600 + Integer.parseInt(endArray[1])*60 + Integer.parseInt(endArray[2]);
        return secondEnd - secondStart;
    }
    public long record(){
        return realRecord() - uuTien();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%02d:%02d:%02d",realRecord()/3600,(realRecord()/60)%60,realRecord()%60)
                + " " + String.format("%02d:%02d:%02d",uuTien()/3600,(uuTien()/60)%60,uuTien()%60)
                + " " + String.format("%02d:%02d:%02d",record()/3600,(record()/60)%60,record()%60);
    }
    
}
public class J05055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        VDV[] arr = new VDV[n];
        Long[] records = new Long[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            arr[i] = new VDV(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            records[i] = arr[i].record();
        }
        Arrays.sort(records);
        HashMap<Long,Integer>map = new HashMap<>();
        int count = 1;
        for(long x : records){
            if(!map.containsKey(x)){
               map.put(x, count);
            }
            count++;
        }
        for(VDV x : arr){
            System.out.println(x + " " + map.get(x.record()));
        }
    }
}
