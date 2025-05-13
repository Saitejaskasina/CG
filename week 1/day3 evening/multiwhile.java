import java.util.Scanner;
public class multiwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (num > 0 && num < 100) {
            int i = 100;
            while (i >= 1) {
                if (i % num == 0) {
                    System.out.println(i);
                }
                i--;
            }
        } else {
            System.out.println("Enter a positive number less than 100");
        }
        sc.close();
    }
}