public class Result
{
	public static void main(String[] params)
	{
		System.out.println("JVM invoked main");
		String percentInString=params[0];
		double convertedPercent=Double.parseDouble(percentInString);
		String percent=Rank.report(convertedPercent);
		System.out.println("return value from Rank.report() " +percent);
		System.out.println("exit main");
	}
}