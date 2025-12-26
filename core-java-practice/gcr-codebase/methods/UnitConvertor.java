public class UnitConvertor{
    public static double convertYardsToFeet(double yards){
        //given conversion values
        double yards2feet=3;
        //formulae to convert
        return yards*yards2feet;
    }
    public static double convertFeetToYards(double feet){
        //given conversion value
        double feet2yards=0.333333;
        //formulae to convert
        return feet*feet2yards;
    }
    public static double convertMetersToInches(double meters){
        //given value
        double meters2inches=39.3701;
        //formula to convert
        return meters*meters2inches;
    }
    public static double convertInchesToMeters(double inches){
        //formulae to convert
        double inches2meters=0.0254;
        return inches*inches2meters;
    }
    public static double convertInchesToCentimeters(double inches){
        //convert value to cm
        double inches2cm=2.54;
        return inches*inches2cm;
    }
    public static void main(String[] args){
        //Display the results
        System.out.println(convertYardsToFeet(10));
        System.out.println(convertFeetToYards(5));
        System.out.println(convertInchesToMeters(3));
        System.out.println(convertInchesToCentimeters(10));
    }
}
