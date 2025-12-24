import java.util.*;
public class SimpleInterest{
	public static double calculateSI(double p, double r, double t) {
        //prt formula
        return (p*r* t)/ 100;
    }
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
        //taking P R T Values from user
		System.out.print("Enter Principal ");
        double p= input.nextDouble();
        System.out.print("Enter Rate of Interest ");
        double r= input.nextDouble();
        System.out.print("Enter Time in years ");
        double t= input.nextDouble();
        double sI= calculateSI(p,r,t);
        //Output print
        System.out.println("The Simple Interest for Principal"+p+", Rate of Interest" +r+", and Time "+t+" is "+sI);
	}

}
