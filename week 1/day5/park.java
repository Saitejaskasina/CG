import java.util.Scanner;


public class park{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter s1");
		int s1 = sc.nextInt();
		System.out.println("enter s2");
		int s2 = sc.nextInt();
		System.out.println("enter s3");
		int s3 = sc.nextInt();
		int n = rounds(s1,s2,s3);
		System.out.println("no of rounds is " +n);
		
	}
		public static int rounds(int s1,int s2,int s3){
		
		int n = 5000/(s1+s2+s3);
		return n;
		
}

}
