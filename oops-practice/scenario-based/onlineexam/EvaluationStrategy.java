package onlineexam;
import java.util.*;
interface EvaluationStrategy {
    int evaluate(List<Question> q, List<String> a);
}
