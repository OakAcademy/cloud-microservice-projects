package composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
	
	private List<Shape> shapes = new ArrayList<>();

	@Override
	public void Draw(String drawingColor) {
		
		for(Shape shape:shapes) {
			
			shape.Draw(drawingColor);
			
		}
		
	}
	
	public void Add(Shape shape) {
		this.shapes.add(shape);
	}
	
	public void Remove(Shape shape) {
		this.shapes.remove(shape);
	}

	public void Clear() {
		
		System.out.println("All shapes will be removed in the list");
		this.shapes.clear();
		
	}
	
	
	
	
	
	
}
