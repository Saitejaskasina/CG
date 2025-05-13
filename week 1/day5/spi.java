import java.util.Scanner;
public class spi{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pricipal");
		int p = sc.nextInt();
		System.out.println("enter rate");
		int r = sc.nextInt();
		System.out.println("enter time");
		int t = sc.nextInt();
		int si = sip(p,r,t);
		System.out.println("The Simple Interest is "+si+" for Principal "+p+", Rate of Interest "+r+" and Time "+t);
		
		sc.close();
	}
	public static int sip(int p, int r, int t){
		int si = (p*r*t)/100;
		return si;
	}
}
