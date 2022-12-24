package frontcontroller;

public class MainTest {

	public static void main(String[] args) {
		
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("EmployeeView");
		frontController.dispatchRequest("ManagerView");

	}

}
