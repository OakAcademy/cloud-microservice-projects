package finalkeyword;

import java.util.ArrayList;

public class FinalTest {
	
	final static public int COUNTER = 5;
	
	public final static ArrayList<String> myCarList = new ArrayList<>();

	public static void main(String[] args) {
		
		myCarList.add("Mercedes");
		myCarList.add("BMW");
		myCarList.add("Ferrari");
		
		//myCarList = new ArrayList<>();
		
		int newCounter = COUNTER;
		int anotherCounter = newCounter++;
		
		int sum = COUNTER + 5;
		
		for(int i = 0; i < COUNTER; i++) {
			System.out.println(i);
		}
		
		String[] cars = new String[COUNTER];
		
		
		
		
		
		/*
		Car myCar = new Car();
		myCar.model = "Ferrari";
		myCar.showMaxSpeed();
		*/

	}

}
