import java.util.Scanner;
public class avgof3numbers {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the 1st number: ");
    int n1 = scanner.nextInt();
    System.out.print("Enter the 2nd number: ");
    int n2 = scanner.nextInt();
    System.out.print("Enter the 3rd number: ");
    int n3 = scanner.nextInt();
    int average = (n1+n2+n3)/3;
    System.out.println("Average : " + average);
    scanner.close();
    }
}

