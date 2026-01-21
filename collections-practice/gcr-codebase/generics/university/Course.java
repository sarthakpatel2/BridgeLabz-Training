package university;
public class Course<T extends CourseType>{
    private String courseCode;
    private String courseName;
    private T courseType;

    public Course(String courseCode, String courseName, T courseType) {
        this.courseCode=courseCode;
        this.courseName= courseName;
        this.courseType=courseType;
    }
    public void displayCourseDetails() {
        System.out.println("Course Code : "+courseCode);
        System.out.println("Course Name : "+courseName);
        System.out.println("Evaluation  : "+courseType.getEvaluationType());
        courseType.evaluate();
        System.out.println();
    }
    public T getCourseType() {
        return courseType;
    }
}
