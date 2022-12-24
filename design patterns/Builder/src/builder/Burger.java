package builder;

public abstract class Burger implements MenuItem {
	
	public Packing packing() {
		
		return new Wrapper();
		
	}
	
	public abstract float price();

}
