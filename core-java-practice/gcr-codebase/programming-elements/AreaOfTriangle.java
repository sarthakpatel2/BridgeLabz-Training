import java.util.*;
class AreaOfTriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //base input
        double baseInCm=sc.nextDouble();
        // height input
        double heightInCm=sc.nextDouble();
        // area calculation
        double areaInCm=(0.5)*baseInCm*heightInCm;
        // cm to inches
        double areaInInches=areaInCm/(2.54*2.54);
        // output
        System.out.print("The area of triangle in cm is "+areaInCm+" while in inches is "+areaInInches);
    }
}