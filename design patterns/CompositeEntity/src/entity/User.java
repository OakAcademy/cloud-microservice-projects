package entity;

public class User {
	
	private CompositeEntity compositeEntity = new CompositeEntity();
	
	public void print() {
		
		for(int i = 0; i < compositeEntity.getData().length; i++) {
			
			System.out.println(compositeEntity.getData()[i]);
			
		}
		
	}
	
	public void setData(String jobState, String satisfaction) {
		
		compositeEntity.setData(jobState, satisfaction);
		
	}

}
