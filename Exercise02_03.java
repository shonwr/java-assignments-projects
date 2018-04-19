/* Paste your Exercise02_03 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.readInt(), but it should be input.readDouble().
For integers, use int unless it is explicitly stated as long. */
import java.util.Scanner;

public class Exercise02_03{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int convertMe = input.nextInt();

    System.out.println("Enter a value for ft: " + convertMe);
    
    double imConverted = convertMe * 0.305;
    System.out.println(convertMe + " feet is " + imConverted + " meters");
    
  }
}

/*Your program is correct.

command>javac Exercise02_03.java
Compiled successful

command>java Exercise02_03
4
Enter a value for ft: 4
4 feet is 1.22 meters

command>*/