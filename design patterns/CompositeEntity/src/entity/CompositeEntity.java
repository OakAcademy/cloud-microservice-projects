package entity;

public class CompositeEntity {
	
	private CoarseGrainedObject obj = new CoarseGrainedObject();
	
	public void setData(String jobState, String satisfaction) {
		
		obj.setData(jobState, satisfaction);
		
	}
	
	public String[] getData() {
		
		return obj.getData();
		
	}

}
