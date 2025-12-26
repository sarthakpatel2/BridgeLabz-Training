public class UnitConvert{
    public static double KmToMiles(double km){
        //given values to convert
        double km2miles=0.621371;
        //formulae to convert Km to miles 
        return km*km2miles;
    }
    public static double MilesToKm(double miles){
        //given value
        double miles2km=1.60934;
        //formulae to convert 
        return miles*miles2km;
    }
    public static double MetersToFeet(double meters){
        //given value
        double meters2feet=3.28084;
        //formulae to convert
        return meters*meters2feet;
    }
    public static double FeetToMeters(double feet){
        //given value
        double feet2meters=0.3048;
        //formulae to convert
        return feet*feet2meters;
    }
    public static void main(String[] args){
        //display the result
        System.out.println(KmToMiles(10));
        System.out.println(MilesToKm(5));
        System.out.println(MetersToFeet(3));
        System.out.println(FeetToMeters(10));
    }
}

