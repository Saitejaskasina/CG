import java.util.Scanner;
public class forsumn{
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number : ");
		int n = sc.nextInt();
		int sum1 = n*(n+1)/2;
		int sum2 = n;
		for ( ; n > 0;n--){
			sum2 = sum2 + n;
		}
		System.out.printf("Sum using formula = %d%n", sum1);
		System.out.printf("sum using whileloop = %d%n", sum2);
		if(sum1 == sum2){
			System.out.printf("The sum of natural numbers is %d", sum1);
		}
		sc.close();
	}
}