import java.util.*;
public class NumberGuessGame{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int low=1;
        int high=100;
        boolean guessed=false;
        System.out.println("Think of a number between 1 and 100");
        System.out.println("Enter 'low', 'high', or 'correct' as feedback");

        while(!guessed){
            int guess=generateGuess(low,high);
            System.out.println("Computer guesses: "+guess);
            String feedback=getUserFeedback();
            if (feedback.equalsIgnoreCase("correct")){
                System.out.println("Computer guessed it right!");
                guessed=true;
            } else if (feedback.equalsIgnoreCase("low")){
                low=guess+1;
            } else if (feedback.equalsIgnoreCase("high")){
                high=guess-1;
            }else{
                System.out.println("Invalid input");
            }
        }
    }
    // generates random guess between low and high
    static int generateGuess(int low, int high){
        return low+(int)(Math.random()*(high-low +1));
    }
    // takes user feedback
    static String getUserFeedback(){
        System.out.print("Is it low, high, or correct? ");
        return sc.next();
    }
}
