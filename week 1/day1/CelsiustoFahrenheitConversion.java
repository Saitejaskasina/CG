import java.util.Scanner;
public class CelsiustoFahrenheitConversion {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Celsius =" );
        double Celsius = sc.nextDouble();
        double Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println( "Fahrenheit = "+ Fahrenheit );
        sc.close();  
        }
    }
    