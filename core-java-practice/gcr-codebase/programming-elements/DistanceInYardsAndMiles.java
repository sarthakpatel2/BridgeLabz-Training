import java.util.*;
class DistanceInYardsAndMiles{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // distance in feet
        double distanceInFeet=sc.nextDouble();
        // feet to yards 
        double distanceInYards=distanceInFeet/3.0;
        // feet to miles
        double distanceInMiles=distanceInYards/1760.0;
        //output
        System.out.println("The distance in yards is "+distanceInYards+" yards and in miles is "+distanceInMiles+" miles");
    }
}