import java.util.Scanner;
public class hashad{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum=0;
		while(temp != 0){
			int digit = temp%10;
			sum = sum + digit;
			int rep = temp/10;
			temp = rep;
		}
		System.out.println("sum is "+ sum);
		if(n%sum == 0 ){
			System.out.println("harshad number");
		}
		else{
			System.out.println("not harshad number");
		}
			
		sc.close();
	}
}
			