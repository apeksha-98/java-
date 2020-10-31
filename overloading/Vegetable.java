public class Vegetable
{
	public static void eating(String name)
	{
		
		System.out.println("invoked eating");
		System.out.println("name of vegetable: "+name);
		
	}
	public static void eating(String name,String colour)
	{
		System.out.println("invoked eating with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 name of vegetable " +name);
		System.out.println("arg2 colour of vegetable " +colour);
		
	}
	public static void eating(String name,int price)
	{
		
		System.out.println("invoked eating with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 name of vegetable "+name);
		System.out.println("arg2 price " +price);
	}
	public static void eating(int price,String name)
	{
		System.out.println("invoked eating with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 price "+price);
		System.out.println("arg2 name of vegetable " +name);
		
	}	
}