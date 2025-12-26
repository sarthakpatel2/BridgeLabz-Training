import java.util.*;
public class BMI{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    // taking input from user
    System.out.print("Enter the height ");
    double height= sc.nextDouble();
    System.out.print("Enter the Weight ");
    double weight = sc.nextDouble();
    //calculate the bmi
    double bmi =weight/(height*height);
    System.out.printf("BMI- %.2f%n", bmi);
    //determine BMI category
    if (bmi < 18.5) {
      System.out.println("Category: Underweight");
    } else if (bmi >= 18.5 && bmi < 25) {
      System.out.println("Category: Normal");
    } else {
      System.out.println("Category: Overweight");
    }

  }
}