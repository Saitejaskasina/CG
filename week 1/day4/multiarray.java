import java.util.Scanner;
public class multiarray{
	public static void main(String[]args){
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the rows");
		int rows = sc.nextInt();
		System.out.println("enter the columns");
		int columns = sc.nextInt();
		int [][] matrix = new int [rows][columns];
		System.out.println("enter the elements");
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<columns; j++){
				 matrix [i][j] = sc.nextInt();
			}
		}
		int[] array = new int[rows*columns];
		int index = 0;
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<columns; j++){
				array[index] = matrix[i][j];
				index++;
		}
		}
		System.out.print("elements of matrix are ");
		
		for(int i = 0; i<rows*columns; i++){
			System.out.print(array[i] + " ");
			
		sc.close();
	}
}
}

		