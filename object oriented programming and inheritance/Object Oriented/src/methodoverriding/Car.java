package methodoverriding;

public class Car extends Vehicle {
	
	public void start() {
		
		System.out.println("The car has started");
		
	}
	
	public void accelerate(int speed) {
		
		System.out.println("The car accelerates at " + speed);
		
	}
	
	public void stop() {
		
		System.out.println("The car has stopped");
		
	}

}
