package composite;

public class Triangle implements Shape {

	@Override
	public void Draw(String drawingColor) {
		
		System.out.println("Drawing the triangle with " + drawingColor + " color");
		
	}

}
