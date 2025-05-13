import java.util.Scanner;

public class service {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter the years of service: ");
        int yearsOfService = sc.nextInt();
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;  
            System.out.printf("Bonus amount: %.2f%n", bonus);
        } else {
            System.out.println("No bonus awarded.");
        }

        sc.close();
    }
}
