/* Paste your Exercise11_01 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.readInt(), but it should be input.readDouble().
For integers, use int unless it is explicitly stated as long. */

import java.util.Scanner;
import java.util.*;

public class Exercise11_01 {
    public static void main(String args[]) {
        double side1;
        double side2;
        double side3;
        String color = "";
        boolean filled;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the length of three sides of a triangle");
        System.out.print("Side 1: ");
        side1 = input.nextDouble();
        System.out.print("Side 2: ");
        side2 = input.nextDouble();
        System.out.print("Side 3: ");
        side3 = input.nextDouble();
        input.nextLine();
        
        System.out.print("Next, enter the color of the triangle: ");
		    color = input.nextLine();
		    System.out.print("\n");
        
        System.out.print("Finally, enter a boolean value for filled: ");
        filled = input.nextBoolean();
        
        System.out.print("\n\n");
        System.out.println("Results");
        System.out.println("Side 1 = " + side1);
        System.out.println("Side 2 = " + side2);
        System.out.println("Side 3 = " + side3);
        System.out.println("Color = " + color);
        System.out.println("Boolean value = " + filled);
        
        //Create new triangle object
        Triangle myTriangle = new Triangle();
        
        //Pass user inputs to constructor
        myTriangle.Triangle(side1,side2,side3,color, filled);
        
        //Print Triangle class' getArea() method
        System.out.println("The area is: " + myTriangle.getArea());
        
        //Print Triangle class' getPerimeter() method
        System.out.println("The perimeter is: " + myTriangle.getPerimeter());
        
        //print Triangle class' createdDate() method
        System.out.println(myTriangle.createdDate());
        
        //Print Triangle class' getColorandFilled() method
        System.out.println(myTriangle.getColorandFilled());
        
        //Triangle class' toString() menthod
        System.out.println(myTriangle.toString());
        
        
        
    }
}

class Triangle {
    //Create object to use for triangle date method
    Date myDateObj = new Date();
    
    private double side1;
    private double side2;
    private double side3;
    private String color;  
    private boolean filled;
    
    
    public void Triangle(){
        
    }
    
    public void Triangle(double mySide1, double mySide2, double mySide3, String myColor, boolean myFilled){
        side1 = mySide1;
        side2 = mySide2;
        side3 = mySide3;
        color = myColor;
        filled = myFilled;
    }
    
    public double getSide1(){
        return side1;
    }
    
    public double getSide2(){
        return side2;
    }
    
    public double getSide3(){
        return side3;
    }
    
    public double getArea(){
        double s=(side1+side2+side3)/2;
        double area=Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
        
        return area;
    }
    
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    
    public String createdDate(){
        return "Created on " + myDateObj.toString();
    }
    
    public String getColorandFilled(){
        return "color: " + color + " and filled: " + filled;
    }
    
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
    
}

/*
Your program is correct.

command>javac Exercise11_01.java
Compiled successful

command>java Exercise11_01
Enter the length of three sides of a triangle
Side 1: 34.5
Side 2: 56.4
Side 3: 36.9

Next, enter the color of the triangle: black

Finally, enter a boolean value for filled: 

Results
Side 1 = 34.5
Side 2 = 56.4
Side 3 = 36.9
Color = black
Boolean value = true
The area is: 616.7889833646517
The perimeter is: 127.80000000000001
Created on Sat May 05 15:11:43 EDT 2018
color: black and filled: true
Triangle: side1 = 34.5 side2 = 56.4 side3 = 36.9

command>
*/

