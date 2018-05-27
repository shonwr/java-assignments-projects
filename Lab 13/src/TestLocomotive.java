public class TestLocomotive
{
    public static void main(String[] args){
       // Locomotive suv0 = new Locomotive();
       // Automobile suv0 = new Locomotive();
       // Locomotive is abstract - cannot be iinstatiated
	   
	   //(START) testing SUV class/////////////////////////////////////////////////////
       System.out.println("Testing SUVs");
       System.out.println("*******************************************");
       
       Automobile suv1 = new Automobile();
       suv1.setFuelType(FuelType.DIESEL);
       System.out.println(suv1.toString());
       
       SUV suv2 = new SUV("LAND ROVER");
       suv2.setFuelType(FuelType.GAS);
       System.out.println(suv2.toString());
       
       System.out.println("Number of SUVs: " + SUV.getNumOfSUVs() + "\n");

       SUV suv3 = new SUV("TOYOTA", "RYAN", 20000.00);
       suv3.setFuelType(FuelType.HYBRID);
       System.out.println(suv3.toString());

       SUV suv4 = new SUV("HONDA", "MICHELLE", 21000.00);
       suv4.setFuelType(FuelType.ELECTRIC);
       System.out.println(suv4.toString());
       
       System.out.println("Number of SUVs: " + SUV.getNumOfSUVs() + "\n");
	   //(END) testing SUV class//////////////////////////////////////////////////////

	   
	   //(START) testing Car class/////////////////////////////////////////////////////
       System.out.println("\nTesting Cars");       
       System.out.println("*******************************************");
       Car myCar = new Car("Mercedes", "Mine", 36000);
       System.out.println(myCar.toString());
       
       Car yourCar = new Car(6);
       yourCar.setOwner("Student");
       yourCar.setPrice(50000);
       System.out.println(yourCar.toString());
	   //(END) testing Car class///////////////////////////////////////////////////////
       
	   //(START) testing Truck class/////////////////////////////////////////////////////
       System.out.println("\nTesting Trucks"); 
       System.out.println("*******************************************");
       //enter code to test Trucks 
       Truck myTruck = new Truck();
       System.out.println(myTruck.toString() + "\n");
       myTruck.setNumOfWheels(8);
       myTruck.getNumOfWheels();
       System.out.println(myTruck.toString() + "\n");
	   //(END) testing Truck class/////////////////////////////////////////////////////

	   //(START) testing Train class/////////////////////////////////////////////////////
       System.out.println("Testing Trains");
       System.out.println("*******************************************");
       Train amtrak = new Train();
       System.out.println(amtrak.toString() + "\n");
       amtrak.setFuelType(FuelType.ELECTRIC);
       amtrak.setNumOfEngines(2);
       amtrak.setNumOfCars(6);
       System.out.println(amtrak.toString() + "\n");
	   //(END) testing Train class/////////////////////////////////////////////////////
       
       System.out.println("Testing Airplanes");
       System.out.println("*******************************************");
       AirPlanes lax_sf = new AirPlanes();
       AirPlanes lax_bom = new AirPlanes(Routes.INTERNATIONAL);
       System.out.println(lax_sf.toString());
       System.out.println(lax_bom.toString());
    }
}
