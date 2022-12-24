package delegate;

public class BusinessLookUp {
	
	public BusinessService getBusinessService(String serviceType) {
		
		if(serviceType.equalsIgnoreCase("EJBService"))
			return new EJBService();
		else
			return new JMSService();
		
	}

}
