import java.util.*;
public class SpringSeason {
    public static boolean isSpring(int month, int day){
        //spring season conditions
        if((month==3&& day>=20) ||(month>3&& month <6)||(month ==6&& day<=20)){
        	return true;
        }    
        return false;
    }
    public static void main(String[] args) {
        Scanner txt= new Scanner(System.in);
        //input for month and day
        System.out.print("Enter month ");
        int month =txt.nextInt();
        System.out.print("Enter day ");
        int day =txt.nextInt();
        if(isSpring(month, day)) {
        	System.out.println("It's a Spring Season");
        }
        else {
        	System.out.println("Not a Spring Season");
        }
    }
    
}
