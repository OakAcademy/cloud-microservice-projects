package locator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cache {
	
	private List<Service> services;
	
	public Cache() {
		
		services = new ArrayList<>();
		
	}
	
	public Service getService(String name) {
		
		for(Service service : services) {
			
			if(service.getServiceName().equalsIgnoreCase(name)) {
				
				System.out.println("Returning cached " + name + " object");
				
			}
			
		}
		
		return null;
		
	}
	
	public void addService(Service newService) {
		
		boolean exist = false;
		for(Service service : services) {
			
			if(service.getServiceName().equalsIgnoreCase(newService.getServiceName())) {
				
				exist = true;
				
			}
			
		}
		if(!exist) {
			services.add(newService);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
