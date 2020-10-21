public class Boolean
{
	public static void main(String[] params)
	{
        arrayOfBoolean();
	}
	public static void arrayOfBoolean()
	{
		boolean twoIsEven=true;
		boolean skyIsPink=false;
		boolean[] booleanArray = {twoIsEven,false};
		
		int sizeOfArray = booleanArray.length;
		
		System.out.println("Number of Elements "+sizeOfArray);
		
		boolean elementAtIndex0 = booleanArray[0];
		System.out.println("Element at index 0 is "+elementAtIndex0);
		
		boolean elementAtIndex1 = booleanArray[1];
		System.out.println("Element at index 1 is "+elementAtIndex1);
		
	}

}