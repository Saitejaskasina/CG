import java.util.Scanner;
public class smallest{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1, number2, number3");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		System.out.println("Is the first number the smallest? ");
		if(number1 < number2 && number1 < number3){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		sc.close();
	}
}