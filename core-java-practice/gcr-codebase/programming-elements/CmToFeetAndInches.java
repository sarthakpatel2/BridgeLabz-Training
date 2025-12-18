import java.util.*;
class CmToFeetAndInches{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //cm input
        double centimeter=sc.nextDouble();
        // cm to feet
        double inches=centimeter/2.54;
        // convert to feet
        double feet=centimeter/30.48;
        // output
        System.out.print("Your height in cm is "+centimeter+" while in feet is "+feet+" and in inches is "+inches);
        
    }
}