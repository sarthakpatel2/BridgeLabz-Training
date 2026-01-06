import java.util.*;
//custom Exception
class InvalidQuizSubmissionException extends Exception{
    public InvalidQuizSubmissionException(String message){
        super(message);
    }
}
public class ResultProcessor{
    //method to calculate score
    public static int calculateScore(String[] correctAnswers,String[] userAnswers)throws InvalidQuizSubmissionException{
        if (correctAnswers.length !=userAnswers.length){
            throw new InvalidQuizSubmissionException("Answer length mismatch");
        }
        int score=0;
        for (int i = 0; i<correctAnswers.length;i++){
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])){
                score++;
            }
        }
        return score;
    }
    //method to return grade
    public static String getGrade(int score,int totalQuestions){
        double percentage=(score*100.0)/totalQuestions;
        if (percentage>=80)
            return "A";
        else if (percentage>=60)
            return "B";
        else if (percentage>=40)
            return "C";
        else
            return "Fail";
    }
    public static void main(String[] args){
        //correct answers
        String[] correctAnswers ={"A","B","C","D","A"};
        //user answers
        String[] user1Answers={"A","B","C","D","B"};
        String[] user2Answers={"A","C","C","B","A"};
        //store scores of multiple users
        List<Integer> scores =new ArrayList<>();
        try{
            int score1=calculateScore(correctAnswers,user1Answers);
            scores.add(score1);
            System.out.println("User 1 Score: "+score1);
            System.out.println("User 1 Grade: "+getGrade(score1,correctAnswers.length));
            int score2=calculateScore(correctAnswers, user2Answers);
            scores.add(score2);
            System.out.println("User 2 Score: "+score2);
            System.out.println("User 2 Grade: "+getGrade(score2,correctAnswers.length));
        } catch (InvalidQuizSubmissionException e){
            System.out.println(e.getMessage());
        }
        //display all scores
        System.out.println("All Scores: "+scores);
    }
}
