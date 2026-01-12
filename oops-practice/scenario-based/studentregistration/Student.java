package studentregistration;
import java.util.*;
public class Student extends Person{
    private List<Course> enrolledCourses =new ArrayList<>();
    private Map<String, String> grades=new HashMap<>();
    public Student(int id, String name){
        super(id, name);
    }
    public List<Course> getEnrolledCourses(){
        return enrolledCourses;
    }
    public void addCourse(Course course){
        enrolledCourses.add(course);
    }
    public void removeCourse(Course course){
        enrolledCourses.remove(course);
    }
    public void addGrade(String courseName, String grade){
        grades.put(courseName, grade);
    }
    public void viewGrades(){
        System.out.println("Grades for "+name+":");
        for (Map.Entry<String, String> entry :grades.entrySet()){
            System.out.println(entry.getKey()+"- "+entry.getValue());
        }
    }
}
