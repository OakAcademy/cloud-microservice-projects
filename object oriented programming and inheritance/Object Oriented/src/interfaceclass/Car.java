package interfaceclass;

public class Car implements CanGo, CanStop {

	@Override
	public void canStop() {
		
		System.out.println("Car can stop");
		
	}

	@Override
	public void canGo() {
		
		System.out.println("Car can go");
		
	}

}
