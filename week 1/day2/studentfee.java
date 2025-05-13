import java.util.Scanner;
public class studentfee{
	
	public static void main ( String[] args){
		Scanner sc = new Scanner(System.in);
		int fee = sc.nextInt();
		int discount = sc.nextInt(); 
		int discountamount = (fee*discount)/100 ;
		int price =  fee - discountamount ;
		System.out.println("The discount amount is INR "+ discountamount +" and final discounted fee is INR " + price);
		sc.close();
	}
}
