public class Wrapper
{
	public static void main(String[] param)
	{
		System.out.println("JVM invoked main");
		System.out.println("The Program will convert string to number");
		
		String age="22";
		byte convertedAge=Byte.parseByte(age);
		System.out.println("converted byte " +convertedAge);
		
		String daysInYear="365";
		short convertedDaysInYear=Short.parseShort(daysInYear);
		System.out.println("converted short " +convertedDaysInYear);
		
		String worldPopulation="780000000";
		long convertedWorldPopulation=Long.parseLong(worldPopulation);
		System.out.println("converted long " +convertedWorldPopulation);
		
		String speedOfLight="299792458";
		int convertedSpeedOfLight=Integer.parseInt(speedOfLight);
		System.out.println("converted integer " +convertedSpeedOfLight);
		
		String cgpa="7.53f";
		float convertedCgpa=Float.parseFloat(cgpa);
		System.out.println("converted float " +convertedCgpa);
		
		String planksConstant="6.62607004";
		double convertedPlanksConstant=Double.parseDouble(planksConstant);
		System.out.println("converted double " +convertedPlanksConstant);
		
		String skyIsBlue="true";
		boolean convertedValue=Boolean.parseBoolean(skyIsBlue);
		System.out.println("converted boolean " +convertedValue);
	}
}