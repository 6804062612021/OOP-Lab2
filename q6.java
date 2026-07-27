//student_6804062612021
package homework2;
import java.util.Date;
import java.util.Scanner;

class Account {
    private int id;
    private double balance;
    private double annualInterest;
    private Date dateCreated;
    
    Account() {
        this.id=0;
        this.balance=0.0;
        this.annualInterest=0.0;
        this.dateCreated=new Date();
    }

    public Account(int id, double balance, double annualInterest, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterest = annualInterest;
        this.dateCreated = dateCreated;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAI(double annualInterest){
        this.annualInterest = annualInterest;
    }

    public int getID() {
        return this.id;
    }
    public double getBalance() {
        return this.balance;
    }
    public double getAI() {
        return this.annualInterest;
    }
    public Date getDate(){
        return this.dateCreated;
    }
    
    public double getMonthlyInterestRate() {
        return this.annualInterest/12.0;
    }
    
    public double getMonthlyInterest() {
        return getMonthlyInterestRate()*balance;
    }
    
    public void withdraw(double money) {
        this.balance-=money;
    }
    
    public void deposit(double money) {
    this.balance+=money;
    }
}


public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account client=new Account();
        client.setID(1122);
        client.setBalance(20000.0);
        client.setAI(0.045);
        client.withdraw(2500.0);
        client.deposit(3000);
        System.out.printf("Balance: %f\nMonthly Interest Rate: %f\n",client.getBalance(),client.getMonthlyInterestRate());
    }
}
