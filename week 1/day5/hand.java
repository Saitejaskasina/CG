import java.util.Scanner;
public class hand{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no of students ");
		int n = sc.nextInt();
		int h = handshake (n);
		sc.close();
	}
	public static int handshake(int n){
		int h = (n*(n-1))/2;
		System.out.println("no of handshakes "+h);
		return h;
	}
}
