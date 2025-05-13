import java.util.Scanner;
public class leap{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the year : ");
		int n = sc.nextInt();
		if(n>= 1582){
			if(n%4==0){
				if(n%100 == 0){
					if(n%400 == 0){
					System.out.print("leap year");
					}
					else{
						System.out.print("not leap year");
					}
				}
				else{
					System.out.print("leap year");
				}
			}
			else{
				System.out.print("not leap year");
			}
		}
		else{
			System.out.print("not leap year");
		}
		sc.close();
	}
}
			