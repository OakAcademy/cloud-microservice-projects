package com.ocp;

public class AllShape {
	
	private int Length;
	private int Height;
	private int Radius;
	private int Type;
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public int getRadius() {
		return Radius;
	}
	public void setRadius(int radius) {
		Radius = radius;
	}
	public int getType() {
		return Type;
	}
	public void setType(int type) {
		Type = type;
	}
	
	public double CalculateArea2() {
		
		if(Type == ShapeType.Rectangle)
			return Length*Height;
		else if(Type == ShapeType.Triangle)
			return Length*Height/2;
		else
			return (22/7)*Radius*Radius;
					
		
	}
	
	
	
	
	
	
	
	
	
	

}
