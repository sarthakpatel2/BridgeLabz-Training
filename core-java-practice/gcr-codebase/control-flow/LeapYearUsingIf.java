import java.util.*;
class LeapYearUsingIf{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input
        System.out.print("Enter a year");
        int year=sc.nextInt();
        // check year>1582
        if(year<1582){
            System.out.print("Enter a year greater than 1582");
            return;
        }
        // check for leap year using if
        if(year%4==0){
            if(year%100!=0){
                System.out.print(year+" is a Leap Year");
            }else{
                if(year%400==0){
                    System.out.print(year+" is a Leap Year");
                }else{
                    System.out.print(year+" is not a Leap Year");
                }
            }
        }else{
            System.out.print(year+" is not a Leap Year");
        }
    }
}