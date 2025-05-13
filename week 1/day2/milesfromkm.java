import java.util.Scanner;
public class milesfromkm{
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		
		double kilometers = sc.nextDouble();
		double miles = kilometers / 1.6;
		
		System.out.printf("The total miles is %.2f mile for the given %.2f km%n", miles, kilometers);
		
		sc.close();
	
	}
}