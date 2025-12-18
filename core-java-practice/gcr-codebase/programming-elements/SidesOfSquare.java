import java.util.*;
class SidesOfSquare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //perimeter input
        double perimeter=sc.nextDouble();
        // side calculation
        double side=perimeter/4;
        System.out.println("The length of side is "+side+" whose perimeter is "+perimeter);
    }
}