package dao;

public class MainTest {

	public static void main(String[] args) {
		
		EmployeeDAO employeeDAO = new EmployeeDAOImp();
		
		for(Employee employee : employeeDAO.getAllEmployees()) {
			
			System.out.println("Employee Name: " + employee.getName() + "\nEmployeeJob: " + employee.getJob()
			+ "\nEmployee registration ID: " + employee.getRegistrationId());
			System.out.println("");
			
		}
		
		Employee employee = employeeDAO.getAllEmployees().get(1);
		employee.setName("Aldous Huxley");
		employee.setJob("New Author");
		employeeDAO.updateEmployee(employee);
		
		System.out.println("");
		
		Employee updatedEmployee = employeeDAO.getAllEmployees().get(1);
		System.out.println("Employee's values changed with Name: " + updatedEmployee.getName() 
		+ " and with Job: " + updatedEmployee.getJob());

	}

}
