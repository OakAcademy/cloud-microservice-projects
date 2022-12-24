package nestedclass;

import java.util.Scanner;

public class LocalClassExample {
	
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a phone number: ");
		
		String userNumber = input.nextLine();
		validatePhoneNumber(userNumber);

	}
	
	public static void validatePhoneNumber(String phoneNumber) {
		
		//in Java 8 and later versions the "final" keyword is not required
		final int numberLength = 10;
		
		//local inner class
		class PhoneNumber{
			
			String validNumber = null;
			
			//constructor
			public PhoneNumber(String number) {
				
				if (number.length() == numberLength) {
					
					validNumber = number;
					
				}else {
					
					validNumber = null;
					
				}
				
			}
			
			//method
			public void printNumber() {
				
				//after Java 8 we can access directly method parameters 
				System.out.println("You entered " + phoneNumber);
				
			}
			
		}
		
		PhoneNumber myNumber = new PhoneNumber(phoneNumber);
		myNumber.printNumber();
		
		if (myNumber.validNumber == null) {
			
			System.out.println("This number is invalid, the phone number must be 10 characters.");
			
		}else {
			
			System.out.println("This number is valid: " + myNumber.validNumber);
			
		}
		
	}

}
