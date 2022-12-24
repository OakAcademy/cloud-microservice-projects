package entity;

public class CoarseGrainedObject {
	
	Employee employee = new Employee();
	Manager manager = new Manager();
	
	public void setData(String jobState, String satisfaction) {
		
		employee.setJobState(jobState);
		manager.setSatisfaction(satisfaction);
		
	}
	
	public String[] getData() {
		
		return new String[] {"Employee: " + employee.getJobState() + " , Manager: " + manager.getSatisfaction()};
		
	}

}
