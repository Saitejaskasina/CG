import java.util.Scanner;
public class athlete {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side1");
        double side1 = sc.nextDouble();
        System.out.println("Enter the length of side2");
        double side2 = sc.nextDouble();
        System.out.println("Enter the length of side3");
        double side3 = sc.nextDouble();
        double perimeter = side1 + side2 + side3;
        double rounds = 5000/perimeter;
        System.out.printf("The total number of rounds the athlete will run is %f to complete 5 km", rounds);
        sc.close();
    }
}