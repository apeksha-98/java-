public class Sports
{
	public static void playing(String name)
	{
		
		System.out.println("invoked playing");
		System.out.println("name of sport: "+name);
		
	}
	
	public static void playing(String name,String nameOfPlayer)
	{
		System.out.println("invoked playing with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 name of player " +nameOfPlayer);
		System.out.println("arg2 nameOfPlayer " +nameOfPlayer);
		
	}
	public static void playing(String name,int noOfPlayers)
	{
		
		System.out.println("invoked playing with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 name of sport "+name);
		System.out.println("arg2 noOfPlayers " +noOfPlayers);
	}
	public static void playing(int noOfPlayers,String name)
	{
		System.out.println("invoked playing with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 noOfPlayers "+noOfPlayers);
		System.out.println("arg2 name of sport " +name);
		
	}	
}