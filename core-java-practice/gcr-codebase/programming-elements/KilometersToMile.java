import java.util.*;
class KilometerToMile{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //kilometer input
        System.out.println("Enter distance:");
        Double km=sc.nextDouble();
        //kilometer to mile conversion
        Double mile=km*0.621371;
        System.out.println("Distance:"+mile);
    }
}