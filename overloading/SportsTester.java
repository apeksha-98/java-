public class SportsTester{


public static void main(String[] param)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length" +param.length);	
        
		String name="cricket";
		Sports.playing(name);
        Sports.playing("cricket","virat");
		Sports.playing("cricket",11);
		Sports.playing(11,"cricket");
	System.out.println("EXIT :: main");	
}

}