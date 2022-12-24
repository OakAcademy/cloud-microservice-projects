package decorator;

public class MainTest {

	public static void main(String[] args) {
		
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("");
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();

	}

}
