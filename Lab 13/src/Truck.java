
public class Truck extends Automobile{
//instance variable
	private int numOfWheels;
	
//constructor
	public Truck() {
		this.numOfWheels = 16;
	}
	
//setters
	public void setNumOfWheels(int myWheels) {
		numOfWheels = myWheels;
	}
	
//getters
	public int getNumOfWheels() {
		return numOfWheels;
	}
	
//toString 
	public String toString() {
		return super.toString() +
		"Number of Wheels: " + numOfWheels; 
	}
}
