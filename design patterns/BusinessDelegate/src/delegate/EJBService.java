package delegate;

public class EJBService implements BusinessService {

	@Override
	public void process() {
		
		System.out.println("Processed EJB Service");
		
	}

}
