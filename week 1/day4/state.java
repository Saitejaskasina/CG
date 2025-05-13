import java.util.Scanner;
public class state{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		System.out.println("enter 5 numbers");

		for(int i = 0; i < 5; i++){
			n[i] = sc.nextInt();
		}
		for(int i = 0; i < 5; i++){
			if( n[i] > 0){
				System.out.printf("%d is positive",n[i]);
			}
			else if ( n[i] == 0){
				System.out.printf("%d is zero",n[i]);
			}
			else{
				System.out.printf("%d is negative",n[i]);
			}
			if (n[i]%2 == 0){
				System.out.printf(" and even %n");
			}
			else{
				System.out.printf(" and odd %n");
			}
		}
		sc.close();
	}
}

