package dao;

import java.util.List;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmployees();
	
	public void addEmployee(Employee employee);
	public Employee getEmployee(int registrationId);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);

}
