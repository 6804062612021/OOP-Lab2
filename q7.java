//student_6804062612021
package homework2;
import java.util.Scanner;

class rectangle {
    double x,y,w,h;
    double x1,x2,y1,y2;
    rectangle(double x,double y,double w,double h) {
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
    }
}

public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double X,Y,W,H;
        System.out.println("Enter r1's center x, y, width, height: ");
        X = input.nextDouble();
        Y = input.nextDouble();
        W = input.nextDouble();
        H = input.nextDouble();
        rectangle r1 = new rectangle(X,Y,W,H);
        
        System.out.println("Enter r2's center x, y, width, height: ");
        X = input.nextDouble();
        Y = input.nextDouble();
        W = input.nextDouble();
        H = input.nextDouble();
        rectangle r2 = new rectangle(X,Y,W,H);
        
        compare(r1,r2);
    }
    
    static void compare(rectangle r1, rectangle r2) {
        int status=0;
        double XcenterDistance = Math.abs(r2.x-r1.x);
        double YcenterDistance = Math.abs(r2.y-r1.y);
        double r2W = r2.w/2;
        double r2H = r2.h/2;
        double r1W = r1.w/2;
        double r1H = r1.h/2;
        if (XcenterDistance <= (r1W+r2W) && YcenterDistance <= (r1H+r2H)) {
            status++;
            if (XcenterDistance+r2W <= r1W && YcenterDistance+r2H <= r1H) {
                status++;
            }
        }
        if(status == 1) System.out.println("r2 is overlapping r1");
        else if (status == 2) System.out.println("r2 is inside r1");
        else System.out.println("r2 is not touching r1");
    }
}
