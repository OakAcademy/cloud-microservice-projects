package delegate;

public class BusinessDelegate {
	
	private BusinessLookUp lookUp = new BusinessLookUp();
	private BusinessService service;
	private String serviceType;
	
	//setter method of serviceType
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public void task() {
		
		service = lookUp.getBusinessService(serviceType);
		service.process();
		
	}
	
	

}
