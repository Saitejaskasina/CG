/*import java.util.Scanner;
public class split2{
	public static void main(String [] args){
		
		
		try(Scanner sc = new Scanner(System.in)){
			String a = sc.nextLine(); 
			String[] b = a.split("\\s");
		for(String wor: b){
			System.out.println(wor);
		}
		}
	}
}*/
/*Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
 */
import java.util.Scanner;
public class split2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		String[] splitWords = str.split("\\s+");
		
		String[] customSplitWords = customSplit(str);
		

		boolean areEqual = compare(splitWords, customSplitWords);
	
		System.out.println("Are the two methods equal? " + areEqual);
	}
	
	public static boolean compare(String[] array1, String[] array2) {
		if (array1.length != array2.length) {
			return false;
		}
		for (int i = 0; i < array1.length; i++) {
			if (!array1[i].equals(array2[i])) {
				return false;
			}
		}
		return true;
	}
	public static String[] customSplit(String str) {
		int wordCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				wordCount++;
			}
		}
		wordCount++; 
		
		String[] words = new String[wordCount];
		int startIndex = 0;
		int wordIndex = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				words[wordIndex] = str.substring(startIndex, i);
				wordIndex++;
				startIndex = i + 1;
			}
		}
		words[wordIndex] = str.substring(startIndex);
		
		return words;
	}
}


			
			
			
	