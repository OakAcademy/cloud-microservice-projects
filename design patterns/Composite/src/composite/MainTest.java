package composite;

public class MainTest {

	public static void main(String[] args) {
		
		Shape triangle = new Triangle();
		Shape square = new Square();
		Drawing drawing = new Drawing();
		
		drawing.Add(triangle);
		drawing.Add(square);
		drawing.Draw("Black");
		drawing.Clear();
		
		drawing.Add(triangle);
		drawing.Add(square);
		drawing.Draw("White");

	}

}
