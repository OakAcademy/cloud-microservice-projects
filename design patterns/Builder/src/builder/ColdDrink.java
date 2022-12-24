package builder;

public abstract class ColdDrink implements MenuItem {
	
	public Packing packing() {
		
		return new Bottle();
		
	}
	
	public abstract float price();

}
