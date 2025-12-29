import java.util.*;
public class ConvertTemperature{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("1.) Celsius to Fahrenheit");
        System.out.println("2.) Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int choice=sc.nextInt();
        if (choice==1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius=sc.nextDouble();
            double fahrenheit=celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Fahrenheit: "+fahrenheit);
        }
        else if (choice== 2){
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit= sc.nextDouble();
            double celsius= fahrenheitToCelsius(fahrenheit);
            System.out.println("Temperature in Celsius: "+celsius);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
    //converts Celsius to Fahrenheit
    static double celsiusToFahrenheit(double c){
        return (c*9/5)+32;
    }
    //converts Fahrenheit to Celsius
    static double fahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }
}
