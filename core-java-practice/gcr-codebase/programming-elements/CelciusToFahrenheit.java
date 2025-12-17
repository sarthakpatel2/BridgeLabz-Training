import java.util.*;
public class CelciusToFahrenheit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //input  for temperature
        System.out.print("Enter temperature in Celcius:");
        double celcius=sc.nextDouble();
        //store fahrenheit value
        double fahrenheit=0;
        // formula
        fahrenheit=(celcius*9/5)+32;
        //print fahrenheit value
        System.out.print("Temperature (in Fahrenheit):"+fahrenheit);
    }
}