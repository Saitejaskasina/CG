
import java.util.Scanner;
public class poundstokg {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double kg = weight*2.2;
        System.out.printf("The weight of the person in pound is %f and in kg is %f", weight, kg);
        sc.close();
    }
}