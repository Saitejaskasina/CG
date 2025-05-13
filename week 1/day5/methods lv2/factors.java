import java.util.Scanner;
public class factors{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int max = 0;

		int[] factors = new int [n/2+1];
		for (int i = 1 ; i<=n ; i++){
			if (n % i == 0){
				factors[max] = i;
				max++;
			}
		}
		int sum = sum(factors,max);
		int prod = prod(factors,max);
		int squaresum = squaresum(factors,max);
		System.out.println(sum);
		System.out.println(prod);
		System.out.println(squaresum);
		
	}
	static int sum(int[] factors,int max){
		int sum =0;
		for(int i = 0; i < max; i++){
			
			 sum += factors[i];
			
		}return sum;
	}
	static int prod(int[] factors,int max){
		int prod =1;
		for(int i = 0; i < max; i++){
			
			 prod *= factors[i];
			
		}return prod;
	}
	static int squaresum(int[] factors,int max){
		int squaresum=0;
		for(int i = 0; i < max; i++){
		
		squaresum += Math.pow(factors[i],2);
			
		}
		return squaresum;
	}
	}