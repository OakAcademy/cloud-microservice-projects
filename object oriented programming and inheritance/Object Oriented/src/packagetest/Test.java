package packagetest;

//built-in package
import java.util.Scanner;

//user-defined package
import packageoperations.*;

import otherpackageoperations.Add;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		Multiply multi = new Multiply();
		System.out.println("Result = " + multi.multiply(number1, number2));
		
		packageoperations.Add myAdd = new packageoperations.Add();
		System.out.println("Result = " + myAdd.add(number1, number2));
		
		//otherpackageoperations.Add
		
		
		
		
		
		
		

	}

}
