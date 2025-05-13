import java.util.Scanner;
public class largest{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1, number2, number3");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		boolean isfirstlargest = number1 >= number2 && number1 >= number3;
		boolean issecondlargest = number2 >= number1 && number2 >= number3;
		boolean isthirdlargest = number3 >= number1 && number3 >= number2;
		System.out.println("Is the first number the largest? " + isfirstlargest);
		System.out.println("Is the second number the largest? " + issecondlargest);
		System.out.println("Is the third number the largest? " +isthirdlargest);
		sc.close();
	}
}