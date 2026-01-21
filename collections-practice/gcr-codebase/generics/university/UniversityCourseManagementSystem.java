package university;
import java.util.*;
public class UniversityCourseManagementSystem{
    public static void main(String[] args){
        Course<CourseType> javaCourse =new Course<>("CS01", "Java Programming",new CourseType("Exam-Based"){
                            @Override
                            public void evaluate(){
                                System.out.println("Evaluation through written examinations");
                            }
                        });
        Course<CourseType> webCourse=new Course<>("CS02", "Web Development",new CourseType("Assignment-Based") {
                            @Override
                            public void evaluate(){
                                System.out.println("Evaluation through assignments and projects");
                            }
                        });
        Course<CourseType> aiCourse=new Course<>("CS03", "A.I",new CourseType("Research-Based"){
                            @Override
                            public void evaluate() {
                                System.out.println("Evaluation through research papers and thesis");
                            }
                        });
        // display individual courses
        javaCourse.displayCourseDetails();
        webCourse.displayCourseDetails();
        aiCourse.displayCourseDetails();
        // wildcard list
        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(javaCourse.getCourseType());
        courseTypes.add(webCourse.getCourseType());
        courseTypes.add(aiCourse.getCourseType());
        CourseManager.displayAllCourses(courseTypes);
    }
}
