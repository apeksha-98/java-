public class Place{
	public static String finder(int fromDistance, int toDistance){
		System.out.println("finder method invoked");
		System.out.println("fromDistance "+fromDistance);
		System.out.println("toDistance "+toDistance);
		if(fromDistance>=0 && toDistance<=200){
			System.out.println("Mysore");
			return "Mysore";
		}
		if(fromDistance>=200 && toDistance<=1000){
			System.out.println("Gujarat");
			return "Gujarat";
		}
		if(fromDistance>=1000 && toDistance<=2500){
			System.out.println("Rajasthan");
			return "Rajasthan";
		}
		if(fromDistance>2500 && toDistance<=3000){
			System.out.println("Kerala");
			return "Kerala";
		}
		if(fromDistance>3000 && toDistance<=3500){
			System.out.println("Bangalore");
			return "Bangalore";
		}
		
		return "place not found";
	}
}