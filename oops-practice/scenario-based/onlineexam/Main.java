package onlineexam;
public class Main {
    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.addQuestion(new Question("DBMS"));
        exam.addQuestion(new Question("OS"));
        Student s = new Student("Sarthak");
        s.submit("DBMS");
        s.submit("OS");
        EvaluationStrategy eval = new ObjectiveEvaluation();
        try {
            if (s.answers.isEmpty())
                throw new ExamTimeExpiredException("Time expired");
            int score = eval.evaluate(exam.questions, s.answers);
            System.out.println("Score: "+score + "/"+exam.questions.size());

        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}
