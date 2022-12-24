package mvc;

public class MainTest {

	public static void main(String[] args) {
		
		Employee model = getFromDB();
		EmployeeView view = new EmployeeView();
		EmployeeController controller = new EmployeeController(model, view);
		controller.update();
		
		System.out.println("**********Change values************");
		
		controller.setName("John Verdon");
		controller.setId(14);
		controller.update();

	}
	
	private static Employee getFromDB() {
		
		Employee employee = new Employee();
		
		employee.setName("Charles Dickens");
		employee.setJob("Author");
		employee.setRegistrationId(12);
		
		return employee;
		
	}

}
