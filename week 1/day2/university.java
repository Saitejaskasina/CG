public class university{
	public static void main ( String[] args){
		int fee = 125000;
		int discount = 10;
		int discountamount = (fee*discount)/100 ;
		int price =  fee - discountamount ;
		System.out.println("The discount amount is INR "+ discountamount +" and final discounted fee is INR " + price);
	}
}
