package examproctor;

import java.util.*;
public class QuestionNavigator {
    private Stack<Integer> navigationStack = new Stack<>();

    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question " + questionId);
    }
    public Integer goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return null;
        }
        return navigationStack.pop();
    }
    public void printNavigationHistory() {
        System.out.println("Navigation Stack: " + navigationStack);
    }
}
