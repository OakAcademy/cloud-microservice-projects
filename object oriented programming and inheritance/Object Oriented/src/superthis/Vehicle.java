package superthis;

public class Vehicle {
	
	String model, type;
	int maxSpeed;
	
	public Vehicle(String type, String model, int maxSpeed) {
		
		this.type = type;
		this.model = model;
		this.maxSpeed = maxSpeed;
		
	}

	//getter methods
	public String getModel() {
		return model;
	}

	public String getType() {
		return type;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	

}
