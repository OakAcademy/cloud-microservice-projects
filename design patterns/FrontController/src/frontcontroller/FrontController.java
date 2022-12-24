package frontcontroller;

public class FrontController {
	
	private Dispatcher dispatcher;
	
	private boolean isAuthenticUser() {
		
		System.out.println("Authentication is successful");
		return true;
	}
	
	private void trackRequest(String request) {
		
		System.out.println("Requested view is " + request);
		
	}
	
	public void dispatchRequest(String request) {
		
		trackRequest(request);
		if(isAuthenticUser())
			dispatcher.dispatch(request);
		
	}

}
