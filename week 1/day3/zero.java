import java.util.Scanner;
public class zero{
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number :");
		int number = sc.nextInt();
		System.out.print("enter the next number : ");
		int nextnumber = sc.nextInt();
		while (nextnumber!=0){
			number = number + nextnumber;
			System.out.printf("%d%n",number);
			System.out.print("enter the next number : ");
			nextnumber = sc.nextInt();
			
		}
		sc.close();
	}
}