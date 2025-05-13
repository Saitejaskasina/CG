import java.util.Scanner;
public class positivenegative{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		if (number > 0){
			System.out.println("Positive");
		}
		else if (number == 0){
			System.out.println("Zero");
		}
		else{
			System.out.println("Negative");
		}
		sc.close();
	}
}