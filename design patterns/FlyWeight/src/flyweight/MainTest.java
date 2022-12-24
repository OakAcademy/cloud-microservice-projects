package flyweight;

public class MainTest {

	static CarFactory carFactory = new CarFactory();

	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {

			Car mercedes = carFactory.getCar("Mercedes");
			System.out.println("Mercedes car was saved in (" + i + ",5) position ");

		}

		for (int i = 1; i < 4; i++) {

			Car jaguar = carFactory.getCar("Jaguar");
			System.out.println("Jaguar car was saved in (" + i + ",10) position ");

		}

		for (int i = 1; i < 4; i++) {

			Car citroen = carFactory.getCar("Citroen");
			System.out.println("Citroen car was saved in (" + i + ",20) position ");

		}

	}

}
