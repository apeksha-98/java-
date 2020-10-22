public class Tree
{
	public static void main(String[] light)
	{
		countryName("India");
		countryName(null);
		//countryName();
		String country="china";
		countryName(country);  //passing reference
	}
	public static void countryName(String name)
	{
		System.out.println("countryName "+name);
	}
}