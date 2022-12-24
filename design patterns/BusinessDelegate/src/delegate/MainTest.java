package delegate;

public class MainTest {

	public static void main(String[] args) {
		
		BusinessDelegate delegate = new BusinessDelegate();
		delegate.setServiceType("EJBService");
		Client client = new Client(delegate);
		client.task();
		
		delegate.setServiceType("JMSService");
		client.task();

	}

}
