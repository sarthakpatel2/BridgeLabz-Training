import java.util.*;
public class WindTemperature{
	public static double calculateWindChill(double temperature, double windSpeed){
        //wind chill formula
		double result = 35.74+0.6215*temperature+(0.4275* temperature-35.75) *Math.pow(windSpeed, 0.16); 
        return result;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input of temperature and wind Speed
        System.out.print("Enter temperature (°F) ");
        double temperature= sc.nextDouble();
        System.out.print("Enter wind speed (mph) ");
        double windSpeed= sc.nextDouble();
        double windChill= calculateWindChill(temperature,windSpeed);
        System.out.println("Wind Chill Temperature: " +windChill);
    }

}
