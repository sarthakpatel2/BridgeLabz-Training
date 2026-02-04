import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Student{
    String name;
    String grade;
    Student(String name, String grade){
        this.name=name;
        this.grade=grade;
    }
    String getName() {
        return name;
    }
    String getGrade() {
        return grade;
    }
}
public class StudentGrouping{
    public static void main(String[] args){
        List<Student> students =Arrays.asList(
            new Student("Sarthak", "A"),
            new Student("Aman", "B"),
            new Student("Sanjh", "A"),
            new Student("Shivam", "C"),
            new Student("Madhav", "B")
        );
        Map<String, List<String>> result=students.stream().collect(Collectors.groupingBy(Student::getGrade,
                    Collectors.mapping(Student::getName, Collectors.toList())
                    ));
        System.out.println(result);
    }
}
