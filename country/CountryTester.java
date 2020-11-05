public class CountryTester{
	public static void main(String[] value){
		System.out.println("Invoked main");
		
		byte states=Country.numberOfStates;
		System.out.println("number of states is "+states);
		
		states=29;
		System.out.println("updated number of states is "+states);
		
		String countryName=Country.countryName;
		System.out.println("countryName is " +countryName);
		
		countryName="belgium";
		System.out.println("Updated countryName is "+countryName);
		
		short code=Country.countryCode;
		System.out.println("country code is "+code);
		
		code=32;
		System.out.println("Updated code is "+code);
		
		String currency=Country.currency;
		System.out.println("currency is "+currency);
		
		currency="$";
		System.out.println("Updated currency is "+currency);
		
		long population=Country.population;
		System.out.println("population is "+population);
		
		population=22345600;
		System.out.println("updated population is "+population);
		
	}
}