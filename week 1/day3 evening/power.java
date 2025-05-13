import java.util.Scanner;
public class power{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number : ");
		int n = sc.nextInt();
		System.out.print("enter the power : ");
		int p = sc.nextInt();
		int result = 1;
		for (int i = 1; i<= p; i++){
			result = result * n;
		}
		System.out.println("result : "+ result);
		sc.close();
	}
}
			