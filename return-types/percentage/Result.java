public class Result
{
	public static void main(String[] params)
	{
		System.out.println("JVM invoked main");
		String percentage=Rank.report(30);
		System.out.println("return value from Rank.report() " +percentage);
		System.out.println("exit main");
	}
}