
public class Train extends Locomotive {
//instance variables
	private FuelType fuel;
	private int numOfCars;
	private int numOfEngines;
	
//constructor
	public Train() {
		this.numOfCars = 4;
		this.numOfEngines = 1;
		this.fuel = FuelType.SOLAR;
	}
	
//setters
	public void setFuelType(FuelType myFuel) {
		fuel = myFuel;
	}
	
	public void setNumOfEngines(int myEngines) {
		numOfEngines = myEngines;
	}
	
	public void setNumOfCars(int myCars) {
		numOfCars= myCars;
	}

//getters
	public FuelType getFuelType() {
		return fuel;
	}
	
	public int getNumOfEngines() {
		return numOfEngines;
	}
	
	public int getNumOfCars() {
		return numOfCars;
	}
	
//toString
	public String toString() {
		return "Fuel Type: " + this.getFuelType() + "\n" +
		"Number of engines: " + this.getNumOfEngines() + "\n" +
		"Number of cars: " + this.getNumOfCars() + "\n";
	}
	
}
