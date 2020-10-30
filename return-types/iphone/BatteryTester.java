public class BatteryTester
{
	public static void main(String[] bats)
	{
		System.out.println("JVM invoked main");
		byte chargeValue=IPhone.charge(-45);
		System.out.println("return value from charge() " +chargeValue);
		System.out.println("exit main");
	}
}