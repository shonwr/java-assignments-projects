public class SUV extends Automobile{
    private static int numOfSUVs = 0;
	
    public SUV(){ 
		super("NA","NA", 0.0); numOfSUVs++; 
	}
    
	public SUV(String ma){ 
		super(ma, "NA", 0.0); numOfSUVs++; 
	}
    
	public SUV(String ma, String o){ 
		super(ma, o, 0.0); numOfSUVs++;
	}
    
	public SUV(String ma, String o, double p){ 
		super(ma, o, p); numOfSUVs++;
	}
    
	public static int getNumOfSUVs(){ 
		return numOfSUVs; 
	}
	
//toString method
	/*
	public String toString(){
		return super.toString() + 
		"Number of SUVs: " + SUV.getNumOfSUVs() + "\n";
	}
	*/
}
