import java.util.Scanner;

public class doubleopt {
     public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double operation1 = a+b*c;
        double operation2 = a*b+c;
        double operation3 = c+a/b;
        double operation4 = a%b+c;
        System.out.printf("The result of Operations are %f, %f, %f and %f ", operation1, operation2, operation3, operation4);
       sc.close();
    }
    
}
