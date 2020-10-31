public class PlanetTester{


public static void main(String[] param)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length" +param.length);	
        
		String name="earth";
		Planet.revolve(name);

		Planet.revolve("mars",9);
		Planet.revolve("jupiter","circle");
         Planet.revolve(9,"mars");

	System.out.println("EXIT :: main");	
}

}