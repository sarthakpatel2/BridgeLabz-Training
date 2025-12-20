import java.util.*;
class LeapYear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input
        System.out.print("Enter a year:");
        int year=sc.nextInt();
        // check year>1582
        if(year<1582){
            System.out.print("Enter a year greater than 1582");
        }else{
            // check for leap year using if_else
            if((year%4==0 && year%100!=0) || (year%400==0)){
                System.out.print(year+" is a Leap Year");
            }else{
                System.out.print(year+" is not a Leap Year");
            }
        }
    }
}