public class AddressTester{
	public static void main(String[] value){
		System.out.println("Invoked main");
		
		short door=Address.doorNumber;
		System.out.println("Door num is "+door);
		
		door=987;
		System.out.println("Updated Door num is "+door);
		
		String street=Address.street;
		System.out.println("street is "+street);
		
		street="4th cross";
		System.out.println("Updated street is "+street);
		
		String city=Address.city;
		System.out.println("city is "+city);
		
		city="Gadag";
		System.out.println("Updated city is "+city);
		
		int pin=Address.pinCode;
		System.out.println("Pin code is "+pin);
		
		pin=58001;
		System.out.println("Updated Pin code is "+pin);
		
	}
}