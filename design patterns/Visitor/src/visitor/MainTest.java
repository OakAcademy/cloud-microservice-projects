package visitor;

public class MainTest {

	public static void main(String[] args) {
		
		Country countries = new Countries();
		CountryVisitorInterface countryVisitorInterface = new CountryVisitor();
		countries.callCountryVisit(countryVisitorInterface);

	}

}
