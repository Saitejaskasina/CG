import java.util.Scanner;
public class natural{
	public static void  main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		if (n>= 0){
			int sum = (n*(n+1))/2;
			System.out.printf("The sum of %d natural numbers is %d", n, sum);
		}
		else{
			System.out.printf("The number %d is not natural number",n);
		}
		sc.close();
	}
}