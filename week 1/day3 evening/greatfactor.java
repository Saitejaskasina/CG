import java.util.Scanner;
public class greatfactor{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		for (int i= n-1; i >0; i--){
			if(n%i == 0){
				System.out.println("greatest factor is "+i);
				break;
			}
		}
		sc.close();
	}
}