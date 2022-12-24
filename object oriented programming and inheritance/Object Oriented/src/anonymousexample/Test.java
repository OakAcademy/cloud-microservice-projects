package anonymousexample;

public class Test {

	public static void main(String[] args) {
		
		/*
		Vehicle vehicle = new Vehicle();
		vehicle.canGo();*/
		
		Car myCar = new Car() {

			@Override
			public void canGo() {
				
				System.out.println(NAME + " can go at " + SPEED);
				
			}
			
		};
		
		myCar.canGo();

	}

}
