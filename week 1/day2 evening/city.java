import java.util.Scanner;
public class city {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the person");
        String name = sc.nextLine();
        System.out.println("enter the name of the city from where the person is travelling");
        String fromCity = sc.nextLine();
        System.out.println("enter the name of the city the person is travelling via");
        String viaCity = sc.nextLine();
        System.out.println("enter the name of the city to where the person is travelling");
        String toCity = sc.nextLine();
        System.out.println("enter the distance from " + fromCity + " to " + viaCity);
        double distfromToVia = sc.nextDouble();
        System.out.println("enter the distance from " + viaCity + " to " + toCity);
        double distviaToFinalCity = sc.nextDouble();
        System.out.println("enter the time taken to travel from " + fromCity + " to " + viaCity);
        double timefromToVia = sc.nextDouble();
        System.out.println("enter the time taken to travel from " + viaCity + " to " + toCity);
        double timeviaToFinalCity = sc.nextDouble();
        double totalDistance = distfromToVia + distviaToFinalCity;
        double totaltimeTaken = timefromToVia + timeviaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totaltimeTaken + " hours");

        sc.close();
    }
}
