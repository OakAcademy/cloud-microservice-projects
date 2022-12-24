package visitor;

public class Countries implements Country {
	
	private Country[] countries;
	
	public Countries() {
		
		countries = new Country[] {new Italy(), new USA(), new Canada()};
		
	}

	@Override
	public void callCountryVisit(CountryVisitorInterface countryVisitorInterface) {
		
		for(int i = 0; i < countries.length; i++) {
			
			countries[i].callCountryVisit(countryVisitorInterface);
			
		}
		
		
	}

}
