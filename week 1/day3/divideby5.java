import java.util.Scanner;
public class divideby5{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int reminder = number%5;
		System.out.printf("Is the number %d divisible by 5? ", number);
		if(number%5 == 0){
			System.out.printf("Yes", number);
		}
		else {
			System.out.printf("No", number);
		}
		sc.close();
		}
		
	}
