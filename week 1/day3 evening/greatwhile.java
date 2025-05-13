import java.util.Scanner;
public class greatwhile{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i = n - 1;
        while (i > 0) {
            if (n % i == 0) {
                System.out.println("greatest factor is " + i);
                break;
            }
            i--;
        }
        sc.close();
    }
}