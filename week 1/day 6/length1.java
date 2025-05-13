import java.util.Scanner;
public class length1{
	public static void main(String [] args){
		
		
		try(Scanner sc = new Scanner(System.in)){
			String a = sc.nextLine(); 
			System.out.println("formula= "+ a.length());
			int i = 0;
			while (true){
				a.charAt(i);
				i++;
			}
		}
	    
		catch(Exception e){
				System.out.println(e);
		}
	}
}


			
			
			
	