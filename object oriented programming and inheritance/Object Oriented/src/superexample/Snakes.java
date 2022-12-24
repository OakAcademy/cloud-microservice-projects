package superexample;

public class Snakes extends Animals {
	
	boolean isMammal = false;
	
	//empty constructor
	public Snakes() {
		
		super();//super call
		System.out.println("This is the Snakes constructor");
		
	}
	
	public void printMammal() {
		
		System.out.println(isMammal);
		System.out.println(super.isMammal);
		
	}
	
	public void eat() {
		
		System.out.println("Snakes eat");
		
	}
	
	public void bite() {
		
		System.out.println("Snakes bite");
		
	}
	
	public void printSituation() {
		
		bite();
		super.eat();
		eat();
		
	}

}
