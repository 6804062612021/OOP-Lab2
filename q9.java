//student_6804062612021
package homework2;
import java.util.Scanner;

class maxPrime {
    public int num,max;
    
    maxPrime() {
        this.num = -1;
        this.max = -1;
    }
    
    boolean isPrime(int num) {
        boolean b=true;
        if(num<=1) b=false;
        else if(num==2) b=true;
        else {
            for(int i=2;i<num;i++) {
                if(num%i==0) b=false; break;
            }
        }
        return b;
    }
    
    void max(int num) {
        if(isPrime(num)) {
            if(num>this.max)
                this.max=num;
        }
    }
    
    void printMax() {
        System.out.println(this.max);
    }
}

public class q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        maxPrime n = new maxPrime();
        int num;
        
        do {
            num=input.nextInt();
            n.max(num);
        } while(num!=0);
        
        n.printMax();
    }
}
