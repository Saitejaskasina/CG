import java.util.Scanner;
import java.lang.Math;
public class math{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter angle");
		double angle = sc.nextDouble();
		double [] result = calculateTrigonometricFunctions( angle);
		System.out.println("sine "+result[0]);
		System.out.println("cos "+result[1]);
		System.out.println("tan " +result[2]);
		sc.close();
	}

public static double[] calculateTrigonometricFunctions(double angle){
	double[] result = new double[3];
	double radian = Math.toRadians(angle);
	result[0] = Math.sin(radian);
	result[1] = Math.cos(radian);
	result[2] = Math.tan(radian);
	return result;
}
}
