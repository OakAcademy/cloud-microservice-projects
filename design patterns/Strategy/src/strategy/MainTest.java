package strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter first number: ");
		float first = Float.parseFloat(br.readLine());
		System.out.println("Please enter second number: ");
		float second = Float.parseFloat(br.readLine());
		
		Context context = new Context(new Addition());
		System.out.println("The addition of these two numbers: " + context.execute(first, second));
		
		context = new Context(new Subtraction());
		System.out.println("The subtraction of these two numbers: " + context.execute(first, second));
		
		context = new Context(new Multiplication());
		System.out.println("The multiplication of these two numbers: " + context.execute(first, second));
		
		context = new Context(new Division());
		System.out.println("The division of these two numbers: " + context.execute(first, second));

	}

}
