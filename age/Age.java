public class Age
{
	public static String ageDefinition(byte age){
		System.out.println("invoked ageDefinition()");
		System.out.println("age:" +age);
		if(age<=5 && age>0)
		{
			System.out.println("age between 0 to 5");
			return "child";
		}
		if(age<=12 && age>5)
		{
			System.out.println("age between 5 to 12");
			return "kid";
		}
		if(age<=19 && age>12)
		{
			System.out.println("age between 12 to 19");
			return "teen";
		}
		if(age<=50 && age>19)
		{
			System.out.println("age between 19 to 50");
			return "adult";
		}
		if(age<=100 && age>50)
		{
			System.out.println("age between 12 to 19");
			return "old";
		}
		return "no-match";
	}
}