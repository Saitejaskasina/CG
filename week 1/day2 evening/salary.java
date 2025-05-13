import java.util.Scanner;
public class salary {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int bonus = sc.nextInt();
        int totalIncome = salary+bonus;
        System.out.printf("The salary is INR %d and bonus is INR %d. Hence Total Income is INR %d", salary, bonus, totalIncome);
        sc.close();
    }
}