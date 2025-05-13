import java.util.Scanner;
public class factors{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum1 = formulae(n);
		int sum2 = recursion(n);
		System.out.println(sum1+","+sum2);
		sc.close();
	}
	static int formulae(int n){
		
		return n*(n+1)/2;
	}
	static int recursion(int n){
		if(n == 1){
			return 1;
		}
		
	return n+ recursion(n-1);
	}
}