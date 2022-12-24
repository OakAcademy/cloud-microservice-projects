package staticimportexample;

public class Car {
	
	static int currentSpeed = 0;
	
	static void showSpeed(int speed) {
		
		System.out.println("Your speed is " + speed);
		
	}
	
	static void speedUp(int increase) {
		
		currentSpeed += increase;
		showSpeed(currentSpeed);
		
	}

}
