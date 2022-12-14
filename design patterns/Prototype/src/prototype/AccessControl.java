package prototype;

public class AccessControl implements Prototype {
	
	private final String controlLevel;
	private String access;
	
	public AccessControl(String controlLevel, String access) {
		
		this.controlLevel = controlLevel;
		this.access = access;
		
	}
	
	public AccessControl clone() {
		
		try {
			return (AccessControl) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			
		}
		
		return null;
		
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getControlLevel() {
		return controlLevel;
	}
	
	
	
	
	
	
	
	

}
