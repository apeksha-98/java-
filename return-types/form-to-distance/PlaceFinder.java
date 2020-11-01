public class PlaceFinder{
	public static void main(String[] find){
		System.out.println("JVM invoked main");
		String fromDistInString=find[0];
	    int fromDistance=Integer.parseInt(fromDistInString);
		
		String toDdistInString=find[1];
	    int toDistance=Integer.parseInt(toDdistInString);
		
		String placeDist=Place.finder(fromDistance,toDistance);
		
	System.out.println("Exit:: main");

	}
}