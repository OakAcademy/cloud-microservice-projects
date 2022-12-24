package template;

public class MainTest {

	public static void main(String[] args) {
		
		HouseTemplate type = new GlassHouse();
		type.build();
		
		System.out.println("-------------------------------");
		
		type = new WoodenHouse();
		type.build();

	}

}
