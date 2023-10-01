
import java.io.*;
import java.math.BigInteger;
import java.util.*;
class Product{
    private String id,name;
    private int usd,month;

    public Product(String id, String name, int usd, int month) {
        this.id = id;
        this.name = name;
        this.usd = usd;
        this.month = month;
    }

    public String getId() {
        return id;
    }

    public int getUsd() {
        return usd;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + usd + " " + month;
    }
    
}
public class J07048{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("SANPHAM.in"));
            int n = sc.nextInt();
            Product[]arr = new Product[n];
            sc.nextLine();
            for(int i = 0; i < n; i++){
                arr[i] = new Product(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            }
            Arrays.sort(arr,new Comparator<Product>(){
                @Override
                public int compare(Product o1, Product o2) {
                    if(o1.getUsd() != o2.getUsd()){
                        return o2.getUsd() - o1.getUsd();
                    }
                    else{
                        return o1.getId().compareTo(o2.getId());
                    }
                }
            });
            for(Product x : arr){
                System.out.println(x);
            }
        }
        catch(FileNotFoundException ex){
            
        }
    }
}
