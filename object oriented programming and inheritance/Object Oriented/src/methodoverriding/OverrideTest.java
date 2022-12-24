package methodoverriding;

public class OverrideTest {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		vehicle.accelerate(80);
		vehicle.stop();
		
		Car myCar = new Car();
		myCar.start();
		myCar.accelerate(100);
		myCar.stop();

	}

}
