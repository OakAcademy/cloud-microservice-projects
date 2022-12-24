package frontcontroller;

public class Dispatcher {
	
	private EmployeeView employeeView;
	private ManagerView managerView;
	
	public Dispatcher() {
		
		employeeView = new EmployeeView();
		managerView = new ManagerView();
		
	}
	
	public void dispatch(String request) {
		
		if(request.equalsIgnoreCase("EmployeeView"))
			employeeView.showView();
		else
			managerView.showView();
		
	}

}
