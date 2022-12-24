package abstractclass;

public class AbstractTest {

	public static void main(String[] args) {
		
		Car myCar = new Car("Car", "Ferrari");
		myCar.start();
		myCar.stop();
		
		myCar.getMaxSpeed();

	}

}
