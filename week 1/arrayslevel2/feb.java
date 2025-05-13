import java.util.Scanner;
public class feb{
	public static void main( String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		for(int i = 0; i< n; i++){
			System.out.println(num1 +" ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		sc.close();
	}
}
			