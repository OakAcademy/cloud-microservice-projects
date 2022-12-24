package proxy;

public class RealInternet implements Internet {

	@Override
	public void Connect(String serverHost) throws Exception {
		
		System.out.println("Connecting " + serverHost + " address");
		
	}

}
