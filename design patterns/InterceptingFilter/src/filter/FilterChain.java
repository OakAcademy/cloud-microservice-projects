package filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	
	private List<Filter> filters = new ArrayList<>();
	private Target target;
	
	public void add(Filter filter) {
		
		filters.add(filter);
		
	}
	
	public void execute(String request) {
		
		for(Filter filter : filters) {
			
			filter.execute(request);
			
		}
		
		target.execute(request);
		
	}
	
	public void setTarget(Target target) {
		
		this.target = target;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
