/*Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
 */
import java.util.Scanner;
import java.lang.Math;
public class extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sine of the angle is: " + result[0]);
        System.out.println("Cosine of the angle is: " + result[1]);
        System.out.println("Tangent of the angle is: " + result[2]);
    }
    public static double[] calculateTrigonometricFunctions(double angle) {
        double[] result = new double[3];
        double radian = Math.toRadians(angle);
        result[0] = Math.sin(radian);
        result[1] = Math.cos(radian);
        result[2] = Math.tan(radian);
        return result;
    }
}