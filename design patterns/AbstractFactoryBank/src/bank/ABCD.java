package bank;

public class ABCD implements Bank {

	private final String BName;
	
	public ABCD() {
		
		BName = "ABCD Bank";
		
	}
	
	@Override
	public String GetBankName() {
		return BName;
	}

}
