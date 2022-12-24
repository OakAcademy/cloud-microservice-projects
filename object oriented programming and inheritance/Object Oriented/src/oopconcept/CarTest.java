package oopconcept;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car("Ferrari");
		
		System.out.println(myCar);
		
		myCar.start();
		myCar.accelerate();
		myCar.showSpeed();
		myCar.stop();
		myCar.showSpeed();
		
		Car myCar1 = new Car("Ferrari", "Red", 2022);
		System.out.println(myCar1);

	}

}
