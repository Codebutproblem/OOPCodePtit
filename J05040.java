
import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    private String id,name;
    private int salary,day;
    private String position;
    private static long totalSalary = 0;

    public Employee(int cnt, String name, int salary, int day, String position) {
        this.id = String.format("NV%02d", cnt);
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.position = position;
    }

    public static long getTotalSalary() {
        return totalSalary;
    }
    
    public long getMonthSalry(){
        return 1l*salary*day;
    }
    public long getReward(){
        if(day >= 25){
            return getMonthSalry()*20/100;
        }
        else if(day >= 22 ){
            return getMonthSalry()*10/100;
        }
        else{
            return 0;
        }
    }
    public long getAllowance(){
        if(position.equals("GD")){
            return 250000;
        }
        if(position.equals("PGD")){
            return 200000;
        }
        if(position.equals("TP")){
            return 180000;
        }
        if(position.equals("NV")){
            return 150000;
        }
        return 0;
    }
    public long getRealSalary(){
        return getMonthSalry() + getReward() + getAllowance();
    }

    @Override
    public String toString() {
        totalSalary += getRealSalary();
        return id + " " + name + " " + getMonthSalry() + " " + getReward() + " " + getAllowance() + " "+  getRealSalary();
    }
    
}

public class J05040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee[] arr = new Employee[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new Employee(i+1,sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.next());
        }
        for(Employee x : arr){
            System.out.println(x);
        }
//        System.out.println("Tong chi phi tien luong: " + Employee.getTotalSalary());
    }   
}
