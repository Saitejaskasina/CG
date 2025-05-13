import java.util.Scanner;
public class height{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		
		int[]  heights= new int [11];
		System.out.println("enter the heights (11) : ");
		int sum = 0;
		for (int i = 0 ; i<11; i++){
			heights[i]= sc.nextInt();
			sum += heights[i];
		}
		int mean = sum/11;
		System.out.println("mean height is "+ mean);
		sc.close();
	}
}

			

		