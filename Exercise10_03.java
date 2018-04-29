/* Paste your Exercise01_01 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.readInt(), but it should be input.readDouble().
For integers, use int unless it is explicitly stated as long. */
import java.lang.*;

public class Exercise10_03 {
    public static void main(String[] args) {
    MyInteger n1 = new MyInteger(5);
    System.out.println("n1 is even? " + n1.isEven());
    System.out.println("n1 is prime? " + n1.isPrime());
    System.out.println("15 is prime? " + MyInteger.isPrime(15));

    char[] chars = {'3', '5', '3', '9'};
    System.out.println(MyInteger.parseInt(chars));

    String s = "3539";
    System.out.println(MyInteger.parseInt(s));

    MyInteger n2 = new MyInteger(24);
    System.out.println("n2 is odd? " + n2.isOdd());
    System.out.println("45 is odd? " + MyInteger.isOdd(45));
    System.out.println("n1 is equal to n2? " + n1.equals(n2));
    System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
}

class MyInteger {
    private int myVal;

    public MyInteger(int value) {
        myVal = value;
    }

    public int getValue() {
        return myVal;
    }

    public boolean isEven() {
        return (myVal % 2) == 0;
    }

    public boolean isOdd() {
        return (myVal % 2) == 1;
    }

    public boolean isPrime() {

      if((myVal > 2 && myVal % 2 == 0) || myVal == 1) {
        return false;
      }

      for (int i = 3; i <= (int)Math.sqrt(myVal); i += 2) {

        if (myVal % i == 0) {
          return false;
        }
      }
    return true;
    }    

    public static boolean isEven(int myInt) {
        return (myInt % 2) == 0;
    }

    public static boolean isOdd(int myInt) {
        return (myInt % 2) == 1;
    }

    public static boolean isPrime(int myInt) {
        if (myInt == 1 || myInt == 2) {
            return true;
        }
        else {
            for (int i = 2; i < myInt; i++) {
                if (i % myInt == 0) return false;
            }
        }
        return true;
    }    

    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }

    public boolean equals(int someInt) {
        if (someInt == myVal) 
            return true;
        return false;
    }

    public boolean equals(MyInteger myInt) {
        if (myInt.myVal == this.myVal) 
            return true;
        return false;
    }

    public static int parseInt(char[] values) {
        return Integer.parseInt(String.valueOf(values));
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}

/*
Your program is incorrect. 

command>javac Exercise10_03.java
Compiled successful

command>java Exercise10_03
n1 is even? false
n1 is prime? true
15 is prime? true
3539
3539
n2 is odd? false
45 is odd? true
n1 is equal to n2? false
n1 is equal to 5? true

command>
*/