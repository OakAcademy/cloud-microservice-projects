package com.ocp;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		
		
		List<Shape> list = new ArrayList<>();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(15);
		rectangle.setLength(10);
		list.add(rectangle);
		
		Circle circle = new Circle();
		circle.setRadius(10);
		list.add(circle);
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setHeight(20);
		rectangle2.setLength(5);
		list.add(rectangle2);
		
		Circle circle2 = new Circle();
		circle2.setRadius(8);
		list.add(circle2);
		
		Triangle triangle = new Triangle();
		triangle.setHeight(10);
		triangle.setLength(15);
		list.add(triangle);
		
		
		for(Shape sp:list) {
			
			if(sp instanceof Rectangle)
				System.out.println("Rectangle's Area = " + sp.CalculateArea());
			else if(sp instanceof Triangle)
				System.out.println("Triangle's Area = " + sp.CalculateArea());
			else
				System.out.println("Circle's Area = " + sp.CalculateArea());
			
		}
		
		
		/*
		List<AllShape> list = new ArrayList<>();
		
		AllShape shape = new AllShape();
		shape.setType(ShapeType.Rectangle);
		shape.setHeight(10);
		shape.setLength(15);
		list.add(shape);
		
		AllShape shape2 = new AllShape();
		shape2.setType(ShapeType.Circle);
		shape2.setRadius(10);
		list.add(shape2);
		
		AllShape triangle = new AllShape();
		triangle.setType(ShapeType.Triangle);
		triangle.setHeight(10);
		triangle.setLength(15);
		list.add(triangle);
		
		for(AllShape sp:list) {
			
			if(sp.getType() == ShapeType.Rectangle)
				System.out.println("Rectangle's Area = " + sp.CalculateArea2());
			else if(sp.getType() == ShapeType.Triangle)
				System.out.println("Triangle's Area = " + sp.CalculateArea2());
			else
				System.out.println("Circle's Area = " + sp.CalculateArea2());
			
		}*/
		
		
		
		
		
		
		

	}

}
