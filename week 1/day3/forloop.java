import java.util.Scanner;
public class forloop{
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number :");
		
		for (int number = sc.nextInt(); number >=1 ; number--){
			System.out.printf("%d%n",number);
		}
		sc.close();
	}
}