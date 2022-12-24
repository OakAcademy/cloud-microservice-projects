package inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		
		//create new Car object
		
		Car myCar = new Car();
		myCar.isAutomatic = true;
		myCar.printGear();
		myCar.model = "Ferrari";
		myCar.color = "Red";
		myCar.maxSpeed = 300;
		myCar.print();
		
		//create new Motorcycle object
		
		Motorcycle myMotorcycle = new Motorcycle();
		myMotorcycle.model = "Kawasaki";
		myMotorcycle.color = "Blue";
		myMotorcycle.maxSpeed = 200;
		myMotorcycle.print();
		
		myMotorcycle.cylinderVolume = "900 cc";
		myMotorcycle.printVolume();

	}

}
