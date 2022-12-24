package visitor;

public class Canada implements Country {

	@Override
	public void callCountryVisit(CountryVisitorInterface countryVisitorInterface) {
		
		countryVisitorInterface.visitor(this);
		
	}

}
