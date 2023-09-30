import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class SP{
    private int thuc,ao;

    public SP(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }
    
    public SP Add(SP o){
        return new SP(this.thuc+o.thuc,this.ao+o.ao);
    }
    public SP Multi(SP o){
        return new SP(this.thuc*o.thuc - this.ao*o.ao, this.thuc*o.ao + o.thuc*this.ao);
    }

    @Override
    public String toString() {
        if(ao >= 0){
            return thuc + " + " + ao +"i";
        }
        else return thuc + " - " + (-1*ao)+"i";
    }
    
}
public class J04018 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            SP a = new SP(sc.nextInt(),sc.nextInt());
            SP b = new SP(sc.nextInt(),sc.nextInt());
            System.out.println(a.Add(b).Multi(a) +", " + a.Add(b).Multi(a.Add(b)));
        }
    }
}
