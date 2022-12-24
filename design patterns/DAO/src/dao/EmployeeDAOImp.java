package dao;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImp implements EmployeeDAO {
	
	List<Employee> employees;
	
	//constructor
	public EmployeeDAOImp() {
		
		employees = new ArrayList<>();
		
		//filling the list
		Employee employee1 = new Employee();
		employee1.setName("Fernando Alonso");
		employee1.setJob("Driver");
		employee1.setRegistrationId(1);
		
		Employee employee2 = new Employee();
		employee2.setName("Charles Dickens");
		employee2.setJob("Author");
		employee2.setRegistrationId(2);
		
		Employee employee3 = new Employee();
		employee3.setName("Karim Benzema");
		employee3.setJob("Footballer");
		employee3.setRegistrationId(3);
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
	}
	
	

	@Override
	public List<Employee> getAllEmployees() {
		return employees;
	}

	@Override
	public void addEmployee(Employee employee) {
		
		employees.add(employee);
		
	}

	@Override
	public Employee getEmployee(int registrationId) {
		
		return employees.get(registrationId);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		
		employees.get(employee.getRegistrationId()).setName(employee.getName());
		employees.get(employee.getRegistrationId()).setJob(employee.getJob());
		System.out.println("Employee with " + employee.getRegistrationId() 
		+ " registration ID was updated with new values");
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		
		employees.remove(employee.getRegistrationId());
		System.out.println("Employee " + employee.getName() + " was deleted from database");
		
	}

}
