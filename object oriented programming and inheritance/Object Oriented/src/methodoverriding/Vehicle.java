package methodoverriding;

public class Vehicle {
	
	void start() {
		
		System.out.println("The vehicle has started");
		
	}
	
	public void accelerate(int speed) {
		
		System.out.println("The vehicle accelerates at " + speed);
		
	}
	
	public void stop() {
		
		System.out.println("The vehicle has stopped");
		
	}

}
