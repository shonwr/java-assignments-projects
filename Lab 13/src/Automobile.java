public class Automobile extends Locomotive
{
    private String mode;
    private String manufacturer;
    private String owner;
    private double price;
    
    public Automobile(){
		this("LAND"); 
	}
    public Automobile(String m) { this.setMode(m); }
    public Automobile(String ma, String o, double p) { 
            this.setManufacturer(ma); this.setOwner(o); this.setPrice(p);}
    public void setMode(String m) { mode = m; }
    public String getMode() { return mode; }
    public void setManufacturer(String m) { manufacturer = m; }
    public String getManufacturer() { return manufacturer; }
    public void setOwner(String o) { owner = o; }
    public String getOwner() { return owner; }
    public void setPrice(double p) { price = p; }
    public double getPrice() { return price; }
    
    public String toString(){ 
    	return "Uses Fuel Type: " + this.getFuelType() +
    		   "\nMode is: " + this.getMode() +
               "\nManufacturer is: " + this.getManufacturer() + 
               "\nOwner is: " + this.getOwner() +
               "\nPrice is: " + this.getPrice() +
               "\n";
    }
}
