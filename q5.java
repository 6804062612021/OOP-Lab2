//student_6804062612021
package homework2;
import java.util.Scanner;

class LinearEquation {
    private double a,b,c,d,e,f;
    
    LinearEquation() {
        this.a=0.0;
        this.b=0.0;
        this.c=0.0;
        this.d=0.0;
        this.e=0.0;
        this.f=0.0;
    }
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public void setVar(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public double getX() {
        return (e*d-b*f)/(a*d-b*c);
    }
    
    public double getY() {
        return (a*f-e*c)/(a*d-b*c);
    }
    
    boolean isSolvable() {
        return (a*d-b*c!=0)?true:false;
    }
    
}

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a b c d e f: ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=input.nextDouble();
        double e=input.nextDouble();
        double f=input.nextDouble();
        LinearEquation eq = new LinearEquation(a,b,c,d,e,f);
        if(eq.isSolvable()) {
            System.out.printf("x is %f and y is %f\n",eq.getX(),eq.getY());
        }
        else{System.out.printf("The equation has no solution\n");}
    }
}
