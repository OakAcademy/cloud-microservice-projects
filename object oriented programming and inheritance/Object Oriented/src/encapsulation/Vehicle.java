package encapsulation;

public class Vehicle {
	
	private String model;
	private int maxSpeed;
	
	public Vehicle(String model, int maxSpeed) {
		
		this.model = model;
		this.maxSpeed = maxSpeed;
		
	}

	//getter and setter methods of maxSpeed
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	//getter method of model
	public String getModel() {
		return model;
	}
	
	

	
	
	
	
}
