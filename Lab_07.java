public class Lab_07{
    public static void main(String args[]) {
        double[] arrayInt = new double[100];
        
        populateArray(arrayInt);
        printArray(arrayInt);
        findAverage(arrayInt);
        //System.out.println("Test");
    }
    
    public static void populateArray(double[] arrayInt){
        for(int i=0; i<100 ;i++){
            double max = 25;
            double min = 1;
            double range = max - min + 1;
            double fill = Math.floor((Math.random()* range) + min);
            arrayInt[i] = fill;
        }
    }
    
    public static void printArray(double[] arrayInt){
        for(int i=0; i<100; i++){
            System.out.println(i + ". " + arrayInt[i]);
        }
    }
    
    public static void findAverage(double[] arrayInt){
        double sum = 0;
		for(int i=0; i<100; i++){
			sum += arrayInt[i];
		}
		System.out.println("\n\nThe average of the array elements is: " + sum/100);
    }
}
