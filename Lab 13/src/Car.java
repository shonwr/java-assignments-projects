
public class Car extends Automobile{
//instance variables
	private int zeroToSixty;
	private double price;
	private String manufacturer;
	private String owner;

//constructors
	public Car(){
		this.setZeroToSixty(3);
	}
	
	public Car(int myZeroToSixty){
		zeroToSixty = myZeroToSixty;
	}

	public Car(String myManufacturer, String myName, double myPrice){
		this.setManufacturer(myManufacturer);
		this.setOwner(myName);
		this.setPrice(myPrice);
		this.setZeroToSixty(3);
	}

	
//setters
	public void setZeroToSixty(int myzerotosixty){
		this.zeroToSixty = myzerotosixty;
	}

	public void setmanufacturer(String mymanufacturer) {
		this.manufacturer = mymanufacturer;
	}
	
	public void setOwner(String myName) {
		this.owner = myName;
	}
	
	public void setPrice(double myPrice) {
		this.price = myPrice;
	}
	
//getter methods
	public int getZeroToSixty(){
		return zeroToSixty;
	}

	public String getmanufacturer() {
		return manufacturer;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return super.toString() + 
		"Zero to Sixty in: " + getZeroToSixty() + "\n";
	
			
		/*
		"\n" +
		"manufacturer: " + this.getmanufacturer() + "\n" +
		"Owner: " + this.getOwner() + "\n";
		description += "Price: " + this.getMyPrice()+ "\n";
		*/
	}
}
