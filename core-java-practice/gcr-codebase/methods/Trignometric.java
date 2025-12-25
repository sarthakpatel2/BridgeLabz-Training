import java.util.*;
public class Trignometric{
	public static void calcTrigonometric(double angle){
        //using built in functions
		double radians= Math.toRadians(angle);
		double sine =Math.sin(radians);
		double cosine= Math.cos(radians);
		double tangent= Math.tan(radians);
		System.out.println("Sine " +sine);
		System.out.println("Cosine "+ cosine);
		System.out.println("Tangent "+ tangent);
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        //take input
		System.out.print("Enter angle in degrees ");
		double angle = sc.nextDouble();
		calcTrigonometric(angle);
	}

}
