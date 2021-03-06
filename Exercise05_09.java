/* Paste your Exercise01_01 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.readInt(), but it should be input.readDouble().
For integers, use int unless it is explicitly stated as long. */

import java.util.Scanner;

/*---Disregard--- Attempt at array object


class Student{
    public String studentName;
    public int studentScore;
    Student(String studentName, int studentScore){
        this.studentName = studentName;
        this.studentScore = studentScore;
    }
}
---End Disregard---*/

public class Exercise05_09 {
    public static void main(String args[]) {
      	 Scanner input = new Scanner(System.in);
      	 
      	 //get input
      	
		
		/*---Disregard--- Attempt at array object
      	 
      	 String[] nameArr = new String[50];
      	 int[] scorearr = new int[50];
      	 
      	 ---End Disregard---*/
      	 
      	 System.out.print("Enter number of students: \n");
      	 int studentSize = input.nextInt();
      	 System.out.print("Number of students: " + studentSize + "\n");
      	 
      	 //declare variables for loop
      	 double scoreOne = 0;
         double scoreTwo = 0;
         String studentOne = "";
         String studentTwo = "";
      	 
      	 //loop through entered data
         for(int i = 0; i < studentSize; i++){
             
             System.out.print("\nEnter student name: ");
             String studentName = input.next();
             System.out.print("\nEnter student score: ");
             int studentScore = input.nextInt();
            
            /*---Disregard--- Attempt at array object
            
            thisArr[i] = new Student(studentName, studentScore);
            System.out.print("\nVal stored in index " + i + ": " + thisArr[i] + "\n" );
           
            ---End Disregard---*/
            
            
             System.out.print("\nStudent name: " + studentName + ", " + "Student score: " + studentScore + "\n");
            
             if (studentScore > scoreOne){
                 studentTwo = studentOne;
                 studentOne = studentName;
                 scoreTwo = scoreOne;
                 scoreOne = studentScore; 
             }else if(studentScore > scoreTwo && studentScore < scoreOne){
                 studentTwo = studentName;
                 scoreTwo = studentScore;
             }
         }
    
         System.out.print("\n\nTop two students: ");
         System.out.print("\n" + studentOne + "'s score is " + scoreOne);
         System.out.print("\n" + studentTwo + "'s score is " + scoreTwo);
    }
}
