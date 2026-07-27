//student_6804062612021
package homework2;
import java.util.Scanner;

class RegularPolygon {
    private int n;
    private double side,x,y;
    double perimeter,area;
    
    RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }
    
    RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }
    
    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    void calPerimeter(int n, double side) {
        this.perimeter=n*side;
    }
    
    void calArea(int n, double side) {
        this.area=(n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
    }
    
    double getPerimeter() {
        calPerimeter(this.n,this.side);
        return this.perimeter;
    }
    
    double getArea() {
        calArea(this.n,this.side);
        return this.area;
    }
    
}

public class q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6,4);
        RegularPolygon p3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("Polygon 1\nPerimeter: "+p1.getPerimeter()+"\nArea: "+p1.getArea());
        System.out.println("\nPolygon 2\nPerimeter: "+p2.getPerimeter()+"\nArea: "+p2.getArea());
        System.out.println("\nPolygon 3\nPerimeter: "+p3.getPerimeter()+"\nArea: "+p3.getArea());
    }
}
