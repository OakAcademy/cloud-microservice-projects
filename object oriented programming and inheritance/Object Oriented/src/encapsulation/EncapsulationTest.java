package encapsulation;

public class EncapsulationTest {

	public static void main(String[] args) {
		
		Car myCar = new Car("Ferrari", 320, false);
		
		myCar.setAutomatic(true);
		System.out.println("Model: " + myCar.getModel());
		System.out.println("Max Speed: " + myCar.getMaxSpeed());
		System.out.println("is car automatic ? " + myCar.isAutomatic());

	}

}
