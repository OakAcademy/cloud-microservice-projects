package delegate;

public class JMSService implements BusinessService {

	@Override
	public void process() {
		
		System.out.println("Processed JMS Service");
		
	}

}
