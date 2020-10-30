public class AgeTester
{
	public static void main(String[] args)
	{
		System.out.println("JVM invoked main");
		String ageInString=args[0];
		byte age=Byte.parseByte(ageInString);
		Age.ageDefinition(age);
		System.out.println("return value from ageDefinition() " +age);
		System.out.println("exit main");
	}
}