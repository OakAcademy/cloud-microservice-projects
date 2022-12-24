package locator;

public class MainTest {

	public static void main(String[] args) {
		
		Service service = ServiceLocator.getService("EmployeeService");
		service.execute();
		
		service = ServiceLocator.getService("CustomerService");
		service.execute();
		
		service = ServiceLocator.getService("EmployeeService");
		service.execute();
		
		service = ServiceLocator.getService("CustomerService");
		service.execute();

	}

}
