package lambdaexample;

public class TestLambda {

	public static void main(String[] args) {
		
		Car myCar = (name, speed) -> {
			
			System.out.println(name + " can go at " + speed);
			
		};
		
		myCar.canGo("Ferrari", 300);

	}

}
