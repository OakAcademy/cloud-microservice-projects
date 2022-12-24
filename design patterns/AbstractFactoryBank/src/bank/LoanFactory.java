package bank;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank GetBankName(String bank) {
		return null;
	}

	@Override
	public Loan GetLoan(String loan) {
		
		if (loan == null) {
			return null;
		}else {
			if(loan.equalsIgnoreCase("Home")) {
				return new HomeLoan();
			}else if (loan.equalsIgnoreCase("Business")) {
				return new BusinessLoan();
			}else if (loan.equalsIgnoreCase("Education")) {
				return new EducationLoan();
			}else {
				return null;
			}
		}
		
		
	}

}
