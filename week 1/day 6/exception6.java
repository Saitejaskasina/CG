/*Write a program to demonstrate IllegalArgumentException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
 */
import java.util.Scanner;
public class exception6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		generateException(str);
		handleException(str);
	}
	
	public static void generateException(String str) {
		System.out.println("Generating Exception...");
		System.out.println(str.substring(5, 2));  
	}
	
	public static void handleException(String str) {
		try {
			System.out.println("Handling Exception...");
			System.out.println(str.substring(5, 2)); 
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException caught: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("RuntimeException caught: " + e.getMessage());
		}
	}
}