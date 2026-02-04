interface UnitConverter{
    static double kmToMiles(double km){
        return km*0.6213;
    }
    static double kgToPounds(double kg){
        return kg*2.2046;
    }
}
public class UnitConversion{
    public static void main(String[] args){
        double distanceKm=10;
        double weightKg=5;
        System.out.println(distanceKm+" km = "+UnitConverter.kmToMiles(distanceKm)+" miles");
        System.out.println(weightKg+" kg = "+UnitConverter.kgToPounds(weightKg)+" lbs");
    }
}
