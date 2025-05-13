import java.util.Scanner;
public class si {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal, Rate of Interest and Time");
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double simpleintrest = (principal*rate*time)/100;
        System.out.printf("The Simple Interest is %f for Principal %f, Rate of Interest %f and Time %f", simpleintrest, principal, rate, time);
        sc.close();
    }
}