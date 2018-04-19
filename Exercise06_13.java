/* Paste your Exercise06_13 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.readInt(), but it should be input.readDouble().
For integers, use int unless it is explicitly stated as long. */
import java.text.DecimalFormat;

public class Exercise06_13{
    public static void main(String args[]) {
		System.out.println("i\t\t\tm(i)");
		
		for (int i = 1; i<=20; i++){
		    System.out.println(i + "\t\t\t" + printSeries(i));
        }   
    }

public static String printSeries(double j){
        DecimalFormat formatMe = new DecimalFormat("#0.0000");    
        double answer = 0;
        String returnMe = "";
        for(double i = 1; i<=j; i++){
            answer += i/(i+1);
            //returnMe = formatMe.format(answer);
		}	
    return formatMe.format(answer);
}
}

/*
Your program is correct.

command>javac Exercise06_13.java
Compiled successful

command>java Exercise06_13
i			m(i)
1			0.5000
2			1.1667
3			1.9167
4			2.7167
5			3.5500
6			4.4071
7			5.2821
8			6.1710
9			7.0710
10			7.9801
11			8.8968
12			9.8199
13			10.7484
14			11.6818
15			12.6193
16			13.5604
17			14.5049
18			15.4523
19			16.4023
20			17.3546

command>
*/
