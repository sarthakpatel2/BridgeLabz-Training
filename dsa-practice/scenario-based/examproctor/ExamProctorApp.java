package examproctor;

public class ExamProctorApp {
    public static void main(String[] args){
        QuestionNavigator navigator =new QuestionNavigator();
        AnswerSheet sheet=new AnswerSheet();
        // Navigation
        navigator.visitQuestion(1);
        sheet.submitAnswer(1,"A");
        navigator.visitQuestion(2);
        sheet.submitAnswer(2,"C");
        navigator.visitQuestion(3);
        sheet.submitAnswer(3,"C");
        navigator.printNavigationHistory();
        // Go back
        System.out.println("Back from Ques" + navigator.goBack());
        // Final evaluation
        int score = Evaluator.calculateScore(sheet.getAnswers());
        System.out.println("Final Score: " + score);
    }
}
