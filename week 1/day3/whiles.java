import java.util.Scanner;
public class whiles{
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number :");
		int number = sc.nextInt();
		while (number>=1){
			System.out.printf("%d%n",number);
			number--;
		}
		sc.close();
	}
}