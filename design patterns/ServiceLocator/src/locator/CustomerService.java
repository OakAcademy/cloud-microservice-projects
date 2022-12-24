package locator;

public class CustomerService implements Service {

	@Override
	public String getServiceName() {
		return "Customer Service";
	}

	@Override
	public void execute() {
		
		System.out.println("Executing customer service");
		
	}

}
