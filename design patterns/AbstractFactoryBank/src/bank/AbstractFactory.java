package bank;

public abstract class AbstractFactory {
	
	public abstract Bank GetBankName(String bank);
	public abstract Loan GetLoan(String loan);

}
