public class Place{
	public static String finder(int distance){
		System.out.println("finder method invoked");
		System.out.println("distance "+distance);
		if(distance==200){
			System.out.println("Mysore");
			return "Mysore";
		}
		if(distance==1500){
			System.out.println("Gujarat");
			return "Gujarat";
		}
		if(distance==2000){
			System.out.println("Rajasthan");
			return "Rajasthan";
		}
		if(distance==153){
			System.out.println("Dharwad");
			return "Dharwad";
		}
		if(distance==412){
			System.out.println("Ballari");
			return "Ballari";
		}
		if(distance>=100000){
			System.out.println("place Not in earth");
			return "place Not in earth";
		}
		return "place not found";
	}
}