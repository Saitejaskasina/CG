import java.util.Scanner;

public class perimeterofrectangle {  
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println(" perimeter of rectangle is " + perimeter);
        scanner.close();
}
}

    
