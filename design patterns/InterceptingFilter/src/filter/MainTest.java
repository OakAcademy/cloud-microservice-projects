package filter;

public class MainTest {

	public static void main(String[] args) {
		
		FManager manager = new FManager(new Target());
		manager.addFilter(new AuthenticationFilter());
		manager.addFilter(new DebuggingFilter());
		
		User user = new User();
		user.setFManager(manager);
		user.sendRequest("Download");

	}

}
