import java.util.Scanner;
public class powercalculation {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("base = ");
        double base = scanner.nextDouble();
        System.out.print("exponent = ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
        scanner.close();   }
    }

  
