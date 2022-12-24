package inheritance;

public class Vehicle {
	
	protected String model;
	private String type;
	String color;
	public int maxSpeed;
	
	public void print() {
		
		System.out.println("Type = " + type);
		System.out.println("Model = " + model);
		System.out.println("Color = " + color);
		System.out.println("MaxSpeed = " + maxSpeed);
		
	}

}
