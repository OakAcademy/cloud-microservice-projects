package polymorphism;

public class Test {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Car();//This works because the car is a subclass of the Vehicle
		vehicle.accelerate();//calls the accelerate method of the Car class
		
		/*
		if (vehicle instanceof Car) {
			Car myCar = (Car) vehicle;
		}*/
		
		Vehicle vehicle1 = new Motorcycle();//this also works
		vehicle1.accelerate();//calls the accelerate method of the Motorcycle class
		
		

	}

}
