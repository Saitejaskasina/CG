import java.util.Scanner;
public class armstr{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum=0;
		while(n != 0){
			int digit = n%10;
			sum = sum + (digit*digit*digit);
			int rep = n/10;
			n = rep;
		}
		System.out.println("sum is "+ sum);
		if(temp == sum){
			System.out.println("armstrong number");
		}
		else{
			System.out.println("not armstrong number");
		}
			
		sc.close();
	}
}
			