import java.util.Scanner;
import java.util.Arrays;

public class Exercise12_15{

	public static void main(String[] args)throws Exception{
		//**********************************************************************
		//First section creates file with 100 random integers 
		//**********************************************************************
		
        //create file class object (myFileObj), and file "Exercise12_15.txt" in working directory
		java.io.File myFileObj = new java.io.File("Exercise12_15.txt");
		
		//create scanner obj (myScannerObj)
        Scanner myScannerObj = new Scanner(System.in);
        
        System.out.println(myFileObj.getAbsolutePath());
        
        //if file exists, prints out "File already exists"
        if(myFileObj.exists()){
            System.out.println("The file already exists");
            System.out.println("System is now exiting...");
			//Comment out System.exit(0) code to test second section if file already exists
            System.exit(0);
        }
       
        
        //create random number generator(1-100)
        int min = 1;
		int max = 100;
        int range = max - min + 1;
        
        //create a PrintWriter class obj (myFileOutputObj)
        java.io.PrintWriter myFileOutputObj = new java.io.PrintWriter(myFileObj);
        
        //use PrintWriter class' println method through object
        for(int i=0; i<100; i++){
            myFileOutputObj.print((Math.random()*range)+min + " ");
        }
      
		//Close scanner obj
		myScannerObj.close();
	  
		//Use printwriter .close() method to finish creating/writing file
        myFileOutputObj.close();
		
		//**********************************************************************
		//Second section reads files, throws data into an array to be sorted, 
		//and ouputs the data in ascending order
		//**********************************************************************
		
		//create scanner obj (myScannerObj)
        Scanner readFileScannerObj = new Scanner(myFileObj);
        
        //create array to store and re-arrange data
  		double[] tmpDouble = new double[100];
  		
  		//create int variable to access index
  		int a=0;

  		//use scanner obj to read from file
  		//use while loop as long as there is input
  		while(readFileScannerObj.hasNext()) {
  			
  			//read data from file
  			String readNum = readFileScannerObj.next();
  			
  			//convert data from file from string into datatype double to work with
  			double convertMe = Double.parseDouble(readNum);
  			
  			//store read data into array
  			tmpDouble[a] = convertMe;
  			a++;
  		}
  		
  		//re-arrange and print array
  		Arrays.sort(tmpDouble);
  		for(int i=0; i<100; i++){
  			System.out.println(tmpDouble[i]);
  		}
  		
  		readFileScannerObj.close();

		
	}

}
