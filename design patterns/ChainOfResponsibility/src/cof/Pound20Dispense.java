package cof;

public class Pound20Dispense implements DispenseChain {
	
	private DispenseChain chain;

	@Override
	public void setNext(DispenseChain chain) {
		
		this.chain = chain;
		
	}

	@Override
	public void dispense(Currency currency) {
		
		if(currency.getAmount() >= 20) {
			
			int num = currency.getAmount() / 20;
			int remainder = currency.getAmount() % 20;
			System.out.println("Dispensing " + num + " 20 Pounds");
			
			if(remainder != 0) {
				
				this.chain.dispense(new Currency(remainder));
				
			}
			
		}else {
			
			this.chain.dispense(currency);
			
		}
		
	}

}
