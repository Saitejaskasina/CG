import java.util.Scanner;
public class spring{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("month is ");
		int month = sc.nextInt();
		System.out.print("Date is ");
		int date = sc.nextInt();
		if (3 < month && month < 6){
			System.out.println("Its a spring season");
		}
		else if ( month == 3 && date >= 20){
			System.out.println("Its a spring season");
		}
		else if (month == 6 && date <= 20){
			System.out.println("Its a spring season");
		}
		else {
			System.out.println("Not a spring season");
		}
		sc.close();
	}
}
		