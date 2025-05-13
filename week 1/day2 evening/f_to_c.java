import java.util.Scanner;
public class f_to_c {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = (f-32)*5/9;
        System.out.printf("The %f fahrenheit is %f celsius", f, c);
        sc.close();
    }

    
}
