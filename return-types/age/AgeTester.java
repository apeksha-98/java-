public class AgeTester
{
	public static void main(String[] args)
	{
		System.out.println("JVM invoked main");
		
		byte age=9;
		String ageValue=Age.ageDefinition(age);
		System.out.println("return value from ageDefinition() " +ageValue);
		System.out.println("exit main");
	}
}