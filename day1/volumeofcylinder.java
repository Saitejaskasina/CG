import java.util.Scanner;
public class volumeofcylinder{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("radius = ");
		double radius = sc.nextInt();
		System.out.print("height = ");
		double height = sc.nextInt();
		double volume = 3.14 * radius*radius * height;
		System.out.println("volume of cylinder = " + volume );
    sc.close();    
        
    }
   
}
		
		