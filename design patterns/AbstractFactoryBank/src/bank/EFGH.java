package bank;

public class EFGH implements Bank {
	
	private final String BName;
	public EFGH() {
		
		BName = "EFGH Bank";
		
	}

	@Override
	public String GetBankName() {
		return BName;
	}

}
