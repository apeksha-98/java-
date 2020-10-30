public class IPhone
{
  public static boolean call()
 {
	System.out.println("invoked call()");
	boolean connected=true;
	return connected;
 }
 public static String message()
 {
	 System.out.println("invoked message()");
	 String msg="hello";
	 return msg;
 }
 public static byte charge(double volts)
 {
	 System.out.println("invoked charge()");
	 System.out.println("volts: " +volts);
	 if(volts>3){
		 System.out.println("volts is greater than 3 ");
		 return 100;
	 }
	 if(volts<3 && volts>0){
		 System.out.println("volts is less than 3");
		 return 0;
	 }
	 return -1;
 }
}