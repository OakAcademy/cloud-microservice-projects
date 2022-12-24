package locator;

public class InitialContext {
	
	public Object lookUp(String jName) {
		
		if(jName.equalsIgnoreCase("EmployeeService")) {
			
			System.out.println("Looking up and creating a new Employee Service");
			return new EmployeeService();
			
		}else if (jName.equalsIgnoreCase("CustomerService")) {
			
			System.out.println("Looking up and creating a new Customer Service");
			return new CustomerService();
			
		}
		
		return null;
		
	}

}
