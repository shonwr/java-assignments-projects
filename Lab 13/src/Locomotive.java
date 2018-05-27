public abstract class Locomotive
{
    private FuelType ft;
	
    public void setFuelType(FuelType f){
		ft = f; 
	}
    public FuelType getFuelType(){ 
		return ft; 
	}
}
