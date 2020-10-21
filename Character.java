public class Character
{
	public static void main(String[] params)
	{
		arrayOfChar();
	}
	public static void arrayOfChar()
	{
	   char[] elements={'A','B','C','D','E','F','G','H','I','J'};
	   int size=elements.length;
	   System.out.println("Length of array is "+size);
	   char elementAtIndex0=elements[0];
	   System.out.println("Element at index 0:"+elementAtIndex0);
	   char elementAtIndex2=elements[2];
	   System.out.println("Element at index 1:"+elementAtIndex2);
	   char elementAtIndex7=elements[7];
	   System.out.println("Element at index 2:"+elementAtIndex7);
	}
}