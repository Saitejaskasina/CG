import java.util.Scanner;
public class multi{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.printf("enter a number: ");
		int n = sc.nextInt();
		
		for (int i = 6;i<9; i++){
			int value  = n * i;
			System.out.printf("%d * %d = %d%n",n,i,value);
		}
		sc.close();
	}
}
			