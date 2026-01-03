class Course{
    String courseName;
    int duration;
    //constructor
    Course(String courseName, int duration) {
        this.courseName =courseName;
        this.duration=duration;
    }
    void displayCourseDetails() {
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration: "+duration+" hours");
    }
}
//first level subclass
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    //constructor
    OnlineCourse(String courseName,int duration, String platform,boolean isRecorded){
        super(courseName,duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
    //display
    @Override
    void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: "+platform);
        System.out.println("Recorded: "+isRecorded);
    }
}
//second level subclass
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    //constructor
    PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,double fee,double discount){
        super(courseName,duration,platform,isRecorded);
        //properties of subclass
        this.fee=fee;
        this.discount=discount;
    }
    @Override
    void displayCourseDetails(){
        super.displayCourseDetails();
        System.out.println("Fee: "+fee);
        System.out.println("Discount: "+discount+"%");
    }
}
//main class
public class EducationalCourse{
    public static void main(String[] args){
        PaidOnlineCourse course=new PaidOnlineCourse("Full Stack",120,"Udemy",true,5000,20);
        course.displayCourseDetails();
    }
}
