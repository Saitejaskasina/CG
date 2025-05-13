import java.util.Scanner;
public class salary{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		double [] salary = new double [3];
		double [] years = new double [3];
		double [] newsalary = new double [3];
		double [] bonusamount = new double [3];
		double total_bonus = 0, total_old_salary =0, new_salary = 0;
		for(int i = 0; i < 3;  i++){
			System.out.println("enter the salary and years ");
			salary[i] = sc.nextint();
			years[i] = sc.nextdouble();
			if (years[i] > 5){
				bonusamount[i] = salary[i]*0.05;
			}
			else {
				bonusamount[i] = salary[i]*0.02;
			}
			newsalary[i] = salary[i]+ bonusamount[i];
		}
		for(int i = 0; i < 3;  i++){
			System.out.printf("%f, %f, %f, %f . ",salary,years,newsalary, bonusamount);
		}			
		
		sc.close();
	}
}

		

		