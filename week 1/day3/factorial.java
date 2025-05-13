import java.util.Scanner;
public class factorial{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int n = sc.nextInt();
		int factorial = n;
		while(n>1){
			n--;
			factorial = factorial * n ;
			
		}
		System.out.printf("Foactorial is %d",factorial);
		sc.close();
	}
}