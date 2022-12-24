package visitor;

public class Italy implements Country {

	@Override
	public void callCountryVisit(CountryVisitorInterface countryVisitorInterface) {
		
		countryVisitorInterface.visitor(this);
		
	}

}
