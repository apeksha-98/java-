public class Country{

   public static void main(String[] names)
   {
	   
	   System.out.println("JVM invoked main");
	   
	   for(int loop=0;loop<names.length;loop++)
	   {
		   System.out.println("looping number"+loop);
		   String mainMethodArg=names[loop];
		   System.out.println("mainMethodArg "+mainMethodArg);
	   }
	   System.out.println("EXIT  :: main");
	   
   }

}