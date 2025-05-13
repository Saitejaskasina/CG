import java.util.Scanner;
public class whilebreak{
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number :");
		int number = sc.nextInt();
		System.out.print("enter the next number : ");
		int nextnumber = sc.nextInt();
		while (true){
			if ( nextnumber < 1){
				break;
			}
			number = number + nextnumber;
			System.out.printf("%d%n",number);
			System.out.print("enter the next number : ");
			nextnumber = sc.nextInt();
			
		}
		sc.close();
	}
}