package com.ocp;

public class Rectangle implements Shape {

	private int Height;
	private int Length;
	
	
	public double CalculateArea() {
		
		return Length*Height;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}
	
	

}
