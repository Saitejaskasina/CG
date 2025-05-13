public class exception5{
	public static void main(String []args){
		
		try{
		String a = "riptide";
		
		System.out.println(a.charAt(a.length()));
		}
		catch (StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException occurred");
		}
		finally{
		System.out.println("wrong at the same time right ");
		}
	}
} 