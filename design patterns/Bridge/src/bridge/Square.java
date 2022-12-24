package bridge;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setColor() {
		
		System.out.println("Square color is: ");
		color.setColor();
		
	}

}
