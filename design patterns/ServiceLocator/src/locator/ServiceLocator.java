package locator;

public class ServiceLocator {
	
	private static Cache cache;
	
	static {
		
		cache = new Cache();
		
	}
	
	public static Service getService(String jName) {
		
		Service service = cache.getService(jName);
		
		if(service != null) {
			return service;
		}
		
		InitialContext context = new InitialContext();
		Service service2 = (Service) context.lookUp(jName);
		cache.addService(service2);
		return service2;
	}

}
