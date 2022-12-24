package com.ocp;

public class Circle implements Shape {

	
	private int Radius;
	
	
	
	public int getRadius() {
		return Radius;
	}



	public void setRadius(int radius) {
		Radius = radius;
	}



	public double CalculateArea() {
		
		return (22/7)*Radius*Radius;
	}

}
