import java.util.*;
public class BMIOfPerson{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input
        //weight in kg
        double weight= sc.nextDouble();
        //height in cm
        double heightCm= sc.nextDouble();
        double heightM= heightCm / 100;
        //calculate bmi
        double bmi =weight/(heightM*heightM);
        System.out.println("BMI: "+bmi);
        //check condition for various bmi
        if (bmi<=18.4) {
            System.out.println("Underweight");
        } else if (bmi<=24.9) {
            System.out.println("Normal");
        } else if (bmi<=39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}