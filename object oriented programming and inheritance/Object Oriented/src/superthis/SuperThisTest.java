package superthis;

public class SuperThisTest {

	public static void main(String[] args) {
		
		Car myCar = new Car("Car", "Ferrari", 320, true);
		
		System.out.println("Type: " + myCar.getType());
		System.out.println("Model: " + myCar.getModel());
		System.out.println("Max Speed: " + myCar.getMaxSpeed());
		System.out.println("isAutomatic: " + myCar.isAutomatic());

	}

}
