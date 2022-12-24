package staticexample;

public class Test {

	public static void main(String[] args) {
		
		Car.showCurrentSpeed(Car.currentSpeed);
		Car.speedUp(60);
		Car.speedUp(160);
		Car.speedDown(100);
		Car.stop();
		
		Car myCar = new Car();
		myCar.speedUp(40);

	}

}
