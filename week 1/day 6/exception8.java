import java.util.Scanner;

public class exception8 {

    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[n];
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        handleException(names);

        scanner.close();
    }
}
