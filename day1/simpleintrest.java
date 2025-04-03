import java.util.Scanner;
public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal = ");
        double Principal = sc.nextInt(); 
        System.out.print("Rate = ");
        double Rate = sc.nextInt();
        System.out.print("Time = ");
        double Time = sc.nextInt();
        double SimpleInterest = (Principal * Rate * Time)/100;
        System.out.print("Simple Interst = " + SimpleInterest);


        sc.close();
    }
    
}
//Simple Interest = (Principal * Rate * Time) / 100. 