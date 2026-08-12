import java.util.*;
class shape{
    void area(){
        System.out.println("Area of shape");
    }
    void area(int a){
        System.out.println("Area of square: " + (a*a));
    }
    void area(int l, int b){
        System.out.println("Area of rectangle: " + (l*b));
    }
    void area(double r){
        System.out.println("Area of circle: " + (3.14*r*r));
    }
    void area(int a, int b, float c){
        System.out.println("Area of triangle: " + (c*a*b));
    }
}

public class classobj {
    public static void main(String[] args) {
        shape s = new shape();
        s.area();
        s.area(5);
        s.area(4, 6);
        s.area(3.5);
        s.area(4, 5, 0.5f);
    }
}
