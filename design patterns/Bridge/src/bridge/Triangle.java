package bridge;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setColor() {
		
		System.out.println("Triangle color is: ");
		color.setColor();
		
	}

}
