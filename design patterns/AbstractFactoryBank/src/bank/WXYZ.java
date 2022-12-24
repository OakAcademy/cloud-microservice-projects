package bank;

public class WXYZ implements Bank {
	
	private final String BName;
	
	public WXYZ() {
		
		BName = "WXYZ Bank";
		
	}

	@Override
	public String GetBankName() {
		return BName;
	}

}
