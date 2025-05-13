
import java.util.Scanner;
public class bmi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no of inputs: ");
		int k = sc.nextInt();
        System.out.print("Enter the weight and height: ");
        int [][] wh = new int[k][4];
			
		for(int i = 0; i<2;i++){
				wh[i][2] = 1;
		}
	
		for(int i = 0; i<2;i++){
			for (int j = 0; j<2; j++){
				wh[i][j] = sc.nextInt();
				
			}System.out.println();
		}
			for(int i = 0; i<2;i++){
			wh[i][2] = wh[i][0]/(wh[i][1]*wh[i][1]);
			
				
		}
				for(int i = 0; i<2;i++){
			for (int j = 0; j<3; j++){
				System.out.printf(wh[i][j]+"\t");
			}System.out.println();
		}
		
	}
	}