package cof;

public interface DispenseChain {
	
	void setNext(DispenseChain chain);
	void dispense(Currency currency);

}
