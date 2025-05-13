
import java.util.Scanner;
public class scase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        double first = sc.nextDouble();
        System.out.print("Enter the second number :");
        double second = sc.nextDouble();
        System.out.print("Enter the operator (+,-,*,/) :");
        String op = sc.next();
        switch(op){
            case "+":
                System.out.println("Addition of "+first+" and "+second+" is :"+(first+second));
                break;
            case "-":
                System.out.println("Subtraction of "+first+" and "+second+" is :"+(first-second));
                break;
            case "*":
                System.out.println("Multiplication of "+first+" and "+second+" is :"+(first*second));
                break;
            case "/":
                System.out.println("Division of "+first+" and "+second+" is :"+(first/second));
                break;
            default:
                System.out.println("Invalid Operator");
        }
        sc.close();
    }
}