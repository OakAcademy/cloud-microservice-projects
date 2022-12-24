package mvc;

public class EmployeeController {
	
	private Employee model;
	private EmployeeView view;
	
	public EmployeeController(Employee model, EmployeeView view) {
		
		this.model = model;
		this.view = view;
		
	}
	
	public String getName() {
		return model.getName();
	}
	
	public void setName(String name) {
		model.setName(name);
	}
	
	public String getJob() {
		return model.getJob();
	}
	
	public void setJob(String job) {
		model.setJob(job);
	}
	
	public int getId() {
		return model.getRegistrationId();
	}
	
	public void setId(int id) {
		model.setRegistrationId(id);
	}
	
	public void update() {
		
		view.printDetails(model.getName(), model.getJob(), model.getRegistrationId());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
