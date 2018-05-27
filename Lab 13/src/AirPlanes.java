public class AirPlanes extends Locomotive {
//instance variables
	private Routes route;
		
//constructor
	public AirPlanes(){
	}
		
	public AirPlanes(Routes myRoute) {
		route = myRoute;
	}
		
//setters
	public void setAirPlaneRoute(Routes myRoute){
		route = myRoute;
	}
	
//getters
	public Routes getAirPlaneRoute(){
		return route;
	}
	
//toString
	public String toString() {
		return "Route: " + getAirPlaneRoute() + "\n"; 
	}
}

