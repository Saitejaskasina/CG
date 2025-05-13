import java.util.Scanner;
public class areaofcircle{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("radius is " );
		double radius = sc.nextInt();
		double areaofcircle = 3.14 * radius*radius;
		System.out.println("area of circle is "+ areaofcircle);
    sc.close();    
        
    }
   
}
		
		