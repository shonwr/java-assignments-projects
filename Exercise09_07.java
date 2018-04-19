/* Paste your Exercise09_07 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.readInt(), but it should be input.readDouble().
For integers, use int unless it is explicitly stated as long. */
import java.util.Date;

public class Exercise09_07{
  public static void main(String[] args){
//create object for Account class passing values
    Account myAccountObject = new Account(1122, 20000);
    myAccountObject.setAnnualInterestRate(4.5);
    myAccountObject.withdraw(2500);
    myAccountObject.deposit(3000);
    System.out.println("Balance: $" + myAccountObject.getBalance());
    System.out.println("Monthly Interest: " + (myAccountObject.getMonthlyInterest()));
    System.out.println("Account Creation Date: " + myAccountObject.getDateCreated());
  }
}

class Account{
  private int id = 0;
  private double balance = 0; 
  private double annualInterestRate = 0;
  private java.util.Date dateCreated = new java.util.Date();

//constructor
  public Account(){
  }
//constructor  
  public Account(int x, double y){
    id = x;
    balance = y;
  }
//Accessor(getter) methods
  public int getId(){
    return id;
  }
  
  public double getBalance(){
    return balance;
  }
  
  public double getAnnualInterestRate(){
    return annualInterestRate;
  }
  
  
  public String getDateCreated(){
    return dateCreated.toString();
  }
  
  
  public double getMonthlyInterestRate(){
    double monthlyInterestRate = (annualInterestRate/100)/12;
    return monthlyInterestRate;
  }
  
  public double getMonthlyInterest(){
    double monthlyInterest = (balance * ((annualInterestRate/100)/12));
    return monthlyInterest;
  }
  
//Mutator(setter(void)) methods
  public void setId(int x){
    id = x;
  }
  
  public void setBalance(double x){
    balance = x;
  }
  
  public void setAnnualInterestRate(double x){
    annualInterestRate = x;
  }
  
  public void withdraw(double x){
    balance -= x;
  }
  
  public void deposit(double y){
    balance += y;
  }
}

/*
Your program is correct.

command>javac Exercise09_07.java
Compiled successful

command>java Exercise09_07
Balance: $20500.0
Monthly Interest: 76.875
Account Creation Date: Wed Apr 18 05:50:06 EDT 2018

command>
*/

