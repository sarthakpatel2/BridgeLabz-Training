package onlineexam;
import java.util.*;
class Student {
    String name;
    List<String> answers = new ArrayList<>();
    Student(String name) {
        this.name = name;
    }
    void submit(String answer){
        answers.add(answer);
    }
}
