public class exception4{
	public static void main(String []args){
		try{
		String a = null;
		int length = a.length();
		System.out.println(a);
		}
		catch (NullPointerException e){
			System.out.println("NULL Exception occurred");
		}
	}
}