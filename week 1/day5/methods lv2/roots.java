import java.util.Scanner;
import java.lang.Math;
public class roots{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		root(a,b,c);
		
	}
	static void root(double a, double b, double c){
		double delta = Math.pow(b,2) - 4*a*c;
		System.out.println("delta is "+ delta );
	if(delta > 0){
		double root1 = (-b + Math.sqrt(delta))/(2*a) ;
		double root2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("roots are "+ root1 + " , "+ root2);
	}
	else if(delta == 0){
		double rootofx = -b/(2*a);
		System.out.println("root is "+ rootofx );
	}
	else {
		System.out.println("empty array");
	}
	
	}
	}


	
		

