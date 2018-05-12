import java.util.Scanner;

public class Exercise12_03{
    public static void main(String args[]){
        
    Scanner userInput = new Scanner(System.in);
    int userIndx;
    //create & fill array 
    int min = 1;
    int max = 100;
    int range = max - min + 1;
    int[] myArray = new int[100];
        
    for(int i=0; i<100; i++){
        myArray[i] = (int)(Math.random()*range)+min;
    }
    
    System.out.println("An array with 100 elements has been created");
    System.out.print("Enter an index of the created array to display it's corresponding value: ");
    userIndx = userInput.nextInt();
    //Try catch blocks added for practice; although unnecessary 
    try{
        System.out.print("The corresponding value to index: " + userIndx + " is " + myArray[userIndx]);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Out of Bounds");
    }
    }
}

/*
Your program is correct.

command>javac Exercise12_03.java
Compiled successful

command>java Exercise12_03
An array with 100 elements has been created
Enter an index of the created array to display it's corresponding value: 78
The corresponding value to index: 78 is 81

command>
