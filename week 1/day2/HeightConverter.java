import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heightincm = scanner.nextDouble();

        double cmtoinches = 1 / 2.54;
        int inchesinfoot = 12;

        double totalInches = heightincm * cmtoinches;

        int feet = (int) (totalInches / inchesinfoot);
        double inches = totalInches ;

        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f", heightincm, feet, inches);

        scanner.close();
    }
}
