package delegate;

public class Client {
	
	BusinessDelegate service;
	
	public Client(BusinessDelegate service) {
		
		this.service = service;
		
	}
	
	public void task() {
		
		service.task();
		
	}

}
