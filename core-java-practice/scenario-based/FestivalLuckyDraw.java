import java.util.*;
public class FestivalLuckyDraw{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int DrawnNumber;
        char moreVisitor='y';
        System.out.println("Diwali Festival Lucky Draw");
         // loop control
        while (moreVisitor=='y'){
            System.out.print("Enter your lucky number: ");
            //input validation
            if (!sc.hasNextInt()){
                System.out.println("Invalid input. Enter a valid number.");
                sc.next(); // discard invalid input
                continue;
            }
            DrawnNumber=sc.nextInt();
            // check divisibility
            if (DrawnNumber%3==0&&DrawnNumber%5==0){
                System.out.println("Congratulations! You won a gift");
            }else{
                System.out.println("Better luck next time.");
            }
            //check for next visitor
            System.out.print("Next visitor? (y/n): ");
            moreVisitor=sc.next().toLowerCase().charAt(0);
        }
        System.out.println("Lucky draw ended");
    }
}
