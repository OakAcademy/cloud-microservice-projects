package filter;

public class FManager {
	
	FilterChain filterChain;
	
	public FManager(Target target) {
		
		filterChain = new FilterChain();
		filterChain.setTarget(target);
		
	}
	
	public void addFilter(Filter filter) {
		
		filterChain.add(filter);
		
	}
	
	public void filterRequest(String request) {
		
		filterChain.execute(request);
		
	}

}
