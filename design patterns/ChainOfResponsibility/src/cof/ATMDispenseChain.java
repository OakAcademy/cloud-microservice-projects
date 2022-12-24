package cof;

import java.util.Scanner;

public class ATMDispenseChain {
	
	private DispenseChain chain50;
	
	public ATMDispenseChain() {
		
		this.chain50 = new Pound50Dispense();
		DispenseChain chain20 = new Pound20Dispense();
		DispenseChain chain10 = new Pound10Dispense();
		
		chain50.setNext(chain20);
		chain20.setNext(chain10);
		
	}
	
	public static void main(String[] args) {
		
		ATMDispenseChain atmDispenseChain = new ATMDispenseChain();
		
		while(true) {
			
			int amount = 0;
			System.out.println("Please enter an amount to Dispense: ");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			
			if(amount % 10 != 0) {
				
				System.out.println("Should be in multiple 10");
				
			}
			
			atmDispenseChain.chain50.dispense(new Currency(amount));
			
		}
		
	}

}
