import java.util.*;
class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //radius input
        double r=sc.nextDouble();
        // area calculation
        double area=3.14*r*r;
        System.out.println("Area of Circle:"+area);
    }
}