/* Paste your Exercise08_01 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.readInt(), but it should be input.readDouble().
For integers, use int unless it is explicitly stated as long. */
import java.util.Scanner;

public class Exercise08_01 {
    //main method
	public static void main(String args[]) {
	    double[][] m = new double[3][4];
        
        populateArray(m);
        sumColumn(m);
    }
    
    //Populate Array method
	public static void populateArray(double[][] p){
		Scanner in = new Scanner(System.in);
	    
	    System.out.println("Enter a 3-by-4 matrix row by row");
	    System.out.println("For example: 7 3.5 9 2 4\n");
        for(int i=0; i<3; i++){
            System.out.println("Enter four numbers for row " + (i+1) + ": ");
            for(int j=0; j<4; j++){
                p[i][j] = in.nextDouble();
	        }
	   }
    }
    
    //Print/iterate through array method
    public static void sumColumn(double[][] p){
        double suma = p[0][0] + p[1][0] + p[2][0];
        double sumb = p[0][1] + p[1][1] + p[2][1];
        double sumc = p[0][2] + p[1][2] + p[2][2];
        double sumd = p[0][3] + p[1][3] + p[2][3];
	    
	    System.out.println("**************************************");
	        for(int i=0; i<3; i++){
	            System.out.print("Row " + (i+1) + "\n");
	                for(int j=0; j<4; j++){
	                    System.out.print(p[i][j] + " ");
	                }
	            System.out.println("\n");
	         }
	         
	    System.out.println("**********************************");
	    System.out.println("Sum of the elements at column 0 (" + p[0][0] +  " + " + p[1][0] +  " + " + p[2][0] + ")" + " is " + suma);
        System.out.println("Sum of the elements at column 1 (" + p[0][1] +  " + " + p[1][1] +  " + " + p[2][1] + ")" + " is " + sumb);
        System.out.println("Sum of the elements at column 2 (" + p[0][2] +  " + " + p[1][2] +  " + " + p[2][2] + ")" + " is " + sumc);
        System.out.println("Sum of the elements at column 3 (" + p[0][3] +  " + " + p[1][3] +  " + " + p[2][3] + ")" + " is " + sumd);
    }
}

/*
Your program is correct.

command>javac Exercise08_01.java
Compiled successful

command>java Exercise08_01
Enter a 3-by-4 matrix row by row
For example: 7 3.5 9 2 4

Enter four numbers for row 1: 
1.0
2.0
3.0
4.0
Enter four numbers for row 2: 
5.0
6.0
7.0
8.0
Enter four numbers for row 3: 
9.0
10.0
11.0
12.0
**************************************
Row 1
1.0 2.0 3.0 4.0 

Row 2
5.0 6.0 7.0 8.0 

Row 3
9.0 10.0 11.0 12.0 

**********************************
Sum of the elements at column 0 (1.0 + 5.0 + 9.0) is 15.0
Sum of the elements at column 1 (2.0 + 6.0 + 10.0) is 18.0
Sum of the elements at column 2 (3.0 + 7.0 + 11.0) is 21.0
Sum of the elements at column 3 (4.0 + 8.0 + 12.0) is 24.0

command>

*/