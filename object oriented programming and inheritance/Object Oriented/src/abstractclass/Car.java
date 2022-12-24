package abstractclass;

public class Car extends Vehicle {

	public Car(String type, String model) {
		super(type, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMaxSpeed() {
		final int MAX_CAR_SPEED = 320;
		System.out.println("The max speed of car is " + MAX_CAR_SPEED);
		return MAX_CAR_SPEED;
	}
	
	@Override
	public void start() {
		System.out.println("Car has started");
	}
	
	@Override
	public void stop() {
		
		System.out.println("Car has stopped");
		
	}
	
	

}
