package filter;

public class User {
	
	FManager manager;
	
	public void setFManager(FManager manager) {
		
		this.manager = manager;
		
	}
	
	public void sendRequest(String request) {
		
		manager.filterRequest(request);
		
	}

}
