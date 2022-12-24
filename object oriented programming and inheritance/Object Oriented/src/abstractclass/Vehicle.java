package abstractclass;

public abstract class Vehicle {
	
	String type, model;
	
	public Vehicle(String type, String model) {
		
		this.type = type;
		this.model = model;
		
	}
	
	//non-abstract methods
	public void start() {
		
		System.out.println("Vehicle has started");
		
	}
	
	public void stop() {
		
		System.out.println("Vehicle has stopped");
		
	}
	
	//abstract methods
	public abstract int getMaxSpeed();//no body
	
	
	
	
	
	
	

}
