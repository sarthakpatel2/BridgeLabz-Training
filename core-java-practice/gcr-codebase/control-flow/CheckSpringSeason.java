import java.util.*;
class CheckSpringSeason{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // input month
        int month=sc.nextInt();
        // input day
        int date=sc.nextInt();
        // check for spring season
        if((month<3 && date<20 ) || (month>6 && date>20)){
            System.out.println("Not a spring season");
        }else{
            System.out.println("It's a spring season");
        }
    }
}