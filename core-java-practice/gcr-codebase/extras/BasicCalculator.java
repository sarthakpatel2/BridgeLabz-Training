import java.util.*;
public class BasicCalculator {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Choose Operation:");
        System.out.println("1.) Addition");
        System.out.println("2.) Subtraction");
        System.out.println("3.) Multiplication");
        System.out.println("4.) Division");

        System.out.print("Enter choice: ");
        int choice=sc.nextInt();
        System.out.print("Enter first number: ");
        double num1=sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2=sc.nextDouble();
        switch(choice){
            case 1:
                System.out.println("Result = "+add(num1,num2));
                break;
            case 2:
                System.out.println("Result = "+subtract(num1,num2));
                break;
            case 3:
                System.out.println("Result = "+multiply(num1, num2));
                break;
            case 4:
                if (num2!=0)
                    System.out.println("Result = "+divide(num1, num2));
                else
                    System.out.println("Division by zero not allowed");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    //addition
    static double add(double x, double y){
        return x+y;
    }
    //subtraction
    static double subtract(double x, double y){
        return x-y;
    }
    //multiplication
    static double multiply(double x, double y){
        return x*y;
    }
    //division
    static double divide(double x,double y){
        return x/y;
    }
}
