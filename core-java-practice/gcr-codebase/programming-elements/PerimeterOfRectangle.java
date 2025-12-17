import java.util.*;
class PerimeterOfRectangle{
    public static void main(Sting[] args){
        Scanner sc=new Scanner(System.in);
        //length input
        double l=sc.nextDouble();
        // breadth input
        double b=sc.nextDouble();
        // perimeter formula
        double p=2*(l+b);
        //print perimeter
        System.out.println("Perimeter of Rectangle:"+p);
    }
}