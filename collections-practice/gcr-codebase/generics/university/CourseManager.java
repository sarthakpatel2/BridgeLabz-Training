package university;
import java.util.*;
public class CourseManager{
    public static void displayAllCourses(List<? extends CourseType> courseTypes){
        System.out.println("\nDisplaying Course Evaluation Types ---");
        for (CourseType type : courseTypes) {
            System.out.println(type.getEvaluationType());
            type.evaluate();
        }
    }
}
