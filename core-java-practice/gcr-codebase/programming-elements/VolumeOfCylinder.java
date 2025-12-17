import java.util.*;
class VolumeOfCylinder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //input radius
        double r=sc.nextDouble();
        //input height
        double h=sc.nextDouble();
        //volume formula
        double volume=3.14*r*r*h;
        //print volume
        System.out.println("Volume:"+volume);
    }
}