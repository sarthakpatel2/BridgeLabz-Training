package studentregistration;
public class StudentRegistrationService extends RegistrationService{
    private static final int MAX_COURSES =3;
    @Override
    public void enroll(Student student, Course course)
            throws CourseLimitExceededException{
        if (student.getEnrolledCourses().size() >=MAX_COURSES){
            throw new CourseLimitExceededException("Cannot enroll in more than " +MAX_COURSES+" courses");
        }
        student.addCourse(course);
        System.out.println("Enrolled in course: "+course.getCourseName());
    }
    @Override
    public void drop(Student student, Course course){
        student.removeCourse(course);
        System.out.println("Dropped course: "+course.getCourseName());
    }
}
