package cof;

public class Pound10Dispense implements DispenseChain {
	
	private DispenseChain chain;

	@Override
	public void setNext(DispenseChain chain) {
		
		this.chain = chain;
		
	}

	@Override
	public void dispense(Currency currency) {
		
		if(currency.getAmount() >= 10) {
			
			int num = currency.getAmount() / 10;
			int remainder = currency.getAmount() % 10;
			System.out.println("Dispensing " + num + " 10 Pounds");
			
			if(remainder != 0) {
				
				this.chain.dispense(new Currency(remainder));
				
			}
			
		}else {
			
			this.chain.dispense(currency);
			
		}
		
	}

}
