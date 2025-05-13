import java.util.Scanner;
public class age{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];
		System.out.println("enter 10 ages");

		for(int i = 0; i < 10; i++){
			age[i] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++){
			if( age[i] >= 18){
				System.out.printf("age is %d so can vote %n",age[i]);
			}
			else if ( age[i] <= 0){
				System.out.println("Invalid%n");
			}
			else{
				System.out.printf("age is %d so cannot vote %n",age[i]);
			}
		}
		sc.close();
	}
}

