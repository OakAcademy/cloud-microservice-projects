package visitor;

public class USA implements Country {

	@Override
	public void callCountryVisit(CountryVisitorInterface countryVisitorInterface) {
		
		countryVisitorInterface.visitor(this);
		
	}

}
