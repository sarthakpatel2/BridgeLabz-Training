package onlineexam;
import java.util.*;
class ObjectiveEvaluation implements EvaluationStrategy {
    public int evaluate(List<Question> q, List<String> a) {
        int score = 0;
        for (int i =0;i< q.size();i++)
            if (q.get(i).correctAnswer.equalsIgnoreCase(a.get(i)))
                score++;
        return score;
    }
}
