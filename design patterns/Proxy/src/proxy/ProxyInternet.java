package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
	
	private Internet internet = new RealInternet();
	private static List<String> bannedSites;
	
	static {
		
		bannedSites = new ArrayList<>();
		
		bannedSites.add("aaa.com");
		bannedSites.add("bbb.com");
		bannedSites.add("ccc.com");
		bannedSites.add("ddd.com");
		
	}
	

	@Override
	public void Connect(String serverHost) throws Exception {
		
		if(bannedSites.contains(serverHost.toLowerCase())) {
			
			throw new Exception("Access Denied");			
		}
		
		internet.Connect(serverHost);
		
	}

}
