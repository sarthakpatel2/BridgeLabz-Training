package examproctor;

import java.util.HashMap;
public class Evaluator {
    // correct answers
    private static final HashMap<Integer, String> correctAnswers = new HashMap<>();

    static {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");
    }
    public static int calculateScore(HashMap<Integer, String> studentAnswers){
        int score =0;
        for (int qId : correctAnswers.keySet()) {
            if (correctAnswers.get(qId)
                    .equalsIgnoreCase(studentAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
