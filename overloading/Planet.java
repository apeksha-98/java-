public class Planet
{
	public static void revolve(String name)
	{
		
		System.out.println("invoked revolve");
		System.out.println("name of planet: "+name);
		
	}
	
	public static void revolve(String name,String shape)
	{
		System.out.println("invoked revolve with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 name of planet " +name);
		System.out.println("arg2 shape of planet " +shape);
		
	}
	public static void revolve(String name,int noOfPlanets)
	{
		
		System.out.println("invoked revolve with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 name of planet "+name);
		System.out.println("arg2 noOfPlanets " +noOfPlanets);
	}
	public static void revolve(int noOfPlanets,String name)
	{
		System.out.println("invoked revolve with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 noOfPlanetss "+noOfPlanets);
		System.out.println("arg2 name of planet " +name);
		
	}	
}