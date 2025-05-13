import java.util.Scanner;
public class whilepower{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        System.out.print("enter the power : ");
        int p = sc.nextInt();
        int result = 1;
        int i = 1;
        while (i <= p) {
            result = result * n;
            i++;
        }
        System.out.println("result : "+ result);
        sc.close();
    }
}