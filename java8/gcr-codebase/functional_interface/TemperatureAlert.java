import java.util.function.Predicate;
public class TemperatureAlert{
    public static void main(String[] args){
        double threshold=37.5;
        //using predicate (provides boolean test method)
        Predicate<Double> isHighTemperature=temp -> temp>threshold;
        //user input
        double currentTemp=39.2;
        if (isHighTemperature.test(currentTemp)){
            System.out.println("High temperature: "+currentTemp);
        }else{
            System.out.println("Temperature is normal: "+currentTemp);
        }
    }
}
