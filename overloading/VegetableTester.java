public class VegetableTester{


public static void main(String[] param)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length" +param.length);	
        
		Vegetable.eating("carrot");

		Vegetable.eating("onion",50);
		Vegetable.eating("potato","onion");
         Vegetable.eating(40,"tomato");

	System.out.println("EXIT :: main");	
}

}