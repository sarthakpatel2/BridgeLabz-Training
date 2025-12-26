import java.util.*;
public class BusRouteDistance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalDist=0;
        // assume each stop adds 3 km
        int stopDistance=3;
        char choices;
        System.out.println("Bus Route Distance Tracker");
        while (true){
            //if bus reached a stop
            totalDist+=stopDistance;
            System.out.println("Reached. Distance traveled: "+totalDist+" km");
            //ask user if he wants to get off
            System.out.print("Do you want to get off? (y/n): ");
            choices=sc.next().toLowerCase().charAt(0);
            //if choice is yes then break
            if (choices=='y') {
                System.out.println("Passenger got off");
                break;
            }
        }
        System.out.println("Total distance traveled: "+totalDist+" km");
    }
}
