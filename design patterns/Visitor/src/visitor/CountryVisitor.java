package visitor;

public class CountryVisitor implements CountryVisitorInterface {

	@Override
	public void visitor(Italy italy) {
		
		System.out.println("Visiting Italy");
		
	}

	@Override
	public void visitor(USA usa) {
		
		System.out.println("Visiting USA");
		
	}

	@Override
	public void visitor(Canada canada) {
		
		System.out.println("Visiting Canada");
		
	}

}
