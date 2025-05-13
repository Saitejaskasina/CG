import java.util.Scanner;
public class evenodd{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number : ");
		int number = sc.nextInt();
		if (number >= 1){
			int size = (number/2)+1;
			int [] even = new int [size];
			int [] odd = new int [size];
			int j=0, k=0;
			for (int i = 0; i < number; i++){
				if ( (i+1)%2 == 0){
					even[j] = i+1;
					j++;
				}
		}
		for (int i = 0; i < number; i++){
			
				if ( (i+1)%2 != 0){
					odd[k] = i+1;
					k++;
				}
		}
		System.out.println("even array : ");
		for (int i = 0; i<size; i++){
			System.out.printf("%d ",even[i]);
		}
		System.out.println("");
		System.out.println("odd array : ");
		for (int i = 0; i<size; i++){
			System.out.printf("%d ",odd[i]);
		}
		}
		else {
			System.out.println("error");
		}
		sc.close();
		}
	}