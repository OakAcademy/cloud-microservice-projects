package com.ocp;

public class Triangle implements Shape {

	private int Length;
	private int Height;
	
	
	
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



	public double CalculateArea() {
		
		return Length*Height/2;
	}

}
