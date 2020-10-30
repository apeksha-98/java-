public class Rank
{
	public static String report(double percentage){
		System.out.println("invoked report()");
		System.out.println("percentage:" +percentage);
		if(percentage<=100 && percentage>70)
		{
			System.out.println("above 70%");
			return "disttinction";
		}
		if(percentage<=70 && percentage>60)
		{
			System.out.println("60% and above but below 70%");
			return "first class";
		}
		if(percentage<=60 && percentage>50)
		{
			System.out.println("50% and above but below 60%");
			return "second class";
		}
		if(percentage<=50 && percentage>35)
		{
			System.out.println("35% and above but below 50%");
			return "passing grade";
		}
		return "fail";
	}
}