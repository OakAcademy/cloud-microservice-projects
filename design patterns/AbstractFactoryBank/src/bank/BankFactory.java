package bank;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank GetBankName(String bank) {
		
		if (bank == null) {
			return null;
		}else {
			if (bank.equalsIgnoreCase("ABCD")) {
				
				return new ABCD();
				
			}else if (bank.equalsIgnoreCase("EFGH")) {
				
				return new EFGH();
				
			}else if (bank.equalsIgnoreCase("WXYZ")) {
				
				return new WXYZ();
				
			}else {
				return null;
			}
		}
		
		
	}

	@Override
	public Loan GetLoan(String loan) {
		return null;
	}

}
