package composite;

public class Square implements Shape {

	@Override
	public void Draw(String drawingColor) {
		
		System.out.println("Drawing the Square with " + drawingColor + " color");
		
	}

}
