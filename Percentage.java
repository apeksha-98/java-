public class Percentage
{
	public static void main(String[] params)
	{
		arrayOfPercentage();
	}
	public static void arrayOfPercentage()
	{
		float sslcPercentage=60.7f;
		float pucPercentage=77f;
		float degreePercentage=66.8f;
		float[] percent={sslcPercentage,pucPercentage,degreePercentage};
		int sizeOfArray=percent.length;
		System.out.println("total elements "+sizeOfArray);
		float elementAtIndex0=percent[0]; 
		System.out.println("Element at index zero "+elementAtIndex0);
		float elementAtIndex1=percent[1]; 
		System.out.println("Element at index one "+elementAtIndex1);
		float elementAtIndex2=percent[2]; 
		System.out.println("Element at index two "+elementAtIndex2);
	}
}