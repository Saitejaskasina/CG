import java.util.Scanner;
public class multi{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("enter the number ");
		int n = sc.nextInt();
		int [] result = new int[10];
		for (int i = 0; i<10; i++){
			result[i] = n*(i+1);
			System.out.println(n +" * " + (i+1)+ " = " + result[i]);
		}
		sc.close();
	}
}
	