public class Book
{
	public static void main(String[] books)
	{
		String[] ministersArray={"BSY","HDK","jagadesh shettar","SM krishna","siddaramaiah"};
		chiefMinister(ministersArray);
		chiefMinister(null);
	}
	public static void chiefMinister(String[] name)
	{
		System.out.println("chiefMinister " +name);
		int size=name.length;
		System.out.println(size);
		String elementAtIndex0=name[0];
		System.out.println("element at 0 " +elementAtIndex0);
		String elementAtIndex1=name[1];
		System.out.println("element at 1 " +name[1]);
	}
}