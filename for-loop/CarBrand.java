public class CarBrand{
public static void main(String[] cars)
{
	getBrands();
}
     public static String[] getBrands()
	 {
	 String[] brandNames={"creta","audi","nano","bmw","maruthi swift"};
	 System.out.println("size of array " +brandNames.length);
	 for(byte count=0;count<brandNames.length;count++)
	 {
		 System.out.println("count "+count);
		 String brand=brandNames[count];
		 System.out.println("name of car brand " +brand);
	 }
	 return brandNames;
	 }

}