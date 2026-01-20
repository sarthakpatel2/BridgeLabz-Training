package examproctor;

import java.util.HashMap;
public class AnswerSheet{
    private HashMap<Integer, String> answers = new HashMap<>();
    public void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for " + questionId);
    }
    public HashMap<Integer, String> getAnswers() {
        return answers;
    }
}
