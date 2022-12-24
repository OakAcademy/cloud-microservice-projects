package locator;

public class EmployeeService implements Service {

	@Override
	public String getServiceName() {
		return "Employee Service";
	}

	@Override
	public void execute() {
		
		System.out.println("Executing Employee Service");
		
	}

}
