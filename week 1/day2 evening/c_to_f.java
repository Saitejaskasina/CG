import java.util.Scanner;
public class c_to_f {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = (c*9/5)+32;
        System.out.printf("The %f celsius is %f fahrenheit", c, f);
    sc.close();
    }
}
