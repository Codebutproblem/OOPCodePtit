import java.util.*;

class Rectange{
    private double width,height;
    private String color;

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = Character.toUpperCase(color.charAt(0)) + "";
        for(int i = 1; i < color.length(); i++){
            this.color += Character.toLowerCase(color.charAt(i));
        }
    }
    public double findArea(){
        return width*height;
    }
    public double findPerimeter(){
        return 2*(width+height);
    }

    @Override
    public String toString() {
        if(width <= 0 || height <= 0){
            return "INVALID";
        }
        return (int)findPerimeter() + " " + (int)findArea() + " " + color;
    }
    
}

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            double width = sc.nextDouble(),height = sc.nextDouble();
            String s = sc.next();
            System.out.println(new Rectange(width,height,s));
        }
    }
}
