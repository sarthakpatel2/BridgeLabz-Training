import java.util.*;
public class LeapYear{
	 public static boolean isLeapYear(int year){
        //given condition for leap year
	        if (year<1582) return false;
            //logic to check leap year
	        if ((year%4==0&&year%100!=0)||year%400==0)
	            return true;
	        return false;
	}
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //take input of year
        System.out.print("Enter year to check:- ");
        int year=input.nextInt();
        //check conditions if they match using if-else
        if (isLeapYear(year)){
        	System.out.println(year+" is a Leap Year");
        }
        else {
        	System.out.println(year+" is not a Leap Year");
        }
    }
}
