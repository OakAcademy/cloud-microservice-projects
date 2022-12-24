package cof;

public class Pound50Dispense implements DispenseChain {
	
	private DispenseChain chain;

	@Override
	public void setNext(DispenseChain chain) {
		
		this.chain = chain;
		
	}

	@Override
	public void dispense(Currency currency) {
		
		if(currency.getAmount() >= 50) {
			
			int num = currency.getAmount() / 50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing " + num + " 50 Pounds");
			
			if(remainder != 0) {
				
				this.chain.dispense(new Currency(remainder));
				
			}
			
		}else {
			
			this.chain.dispense(currency);
			
		}
		
	}

}
