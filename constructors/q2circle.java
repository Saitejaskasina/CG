import java.util.Scanner;

public class q2circle {
    int radius;
    int Radius;

    public q2circle(){
        radius = 0;
    }
    public q2circle(int radius){
        Radius = radius;
    }
    public void display(){
        System.out.println("radius is "+ Radius );
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt(); 

        q2circle circle2 = new q2circle(radius);
       


        circle2.display();
    }
}
