package bank;

public class FactoryCreator {
	
	public static AbstractFactory GetFactory(String Choice) {
		
		if(Choice.equals("Bank")) {
			return new BankFactory();
		}else if (Choice.equals("Loan")) {
			return new LoanFactory();
		}else {
			return null;
		}
		
	}

}
