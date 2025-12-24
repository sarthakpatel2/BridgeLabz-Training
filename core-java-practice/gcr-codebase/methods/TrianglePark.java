import java.util.*;
public class TrianglePark{
	public static int calculateRounds(double a,double b,double c){
		double perimeter= a+b+c;
        //perimeter of triangle
		double distance= 5000; // 5 km in meters
		return (int) Math.ceil(distance / perimeter);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
        //input sides of triangular park
		System.out.print("Enter side of triangular park ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		int rounds= calculateRounds(a,b,c);
		System.out.println("The athlete must complete "+rounds+" rounds to run 5 km");
	}
}
