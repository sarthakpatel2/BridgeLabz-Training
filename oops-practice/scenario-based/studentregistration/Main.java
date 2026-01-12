package studentregistration;
public class Main{
    public static void main(String[] args){
        Student student =new Student(1,"Sarthak");
        Course java=new Course("Java");
        Course python=new Course("Python");
        Course dbms=new Course("DBMS");
        Course os=new Course("Operating Systems");
        RegistrationService service= new StudentRegistrationService();
        try{
            service.enroll(student,java);
            service.enroll(student,python);
            service.enroll(student,dbms);
            service.enroll(student,os); //exception will occur here when we will exceed the course limit
        } catch (CourseLimitExceededException e){
            System.out.println("Error: "+e.getMessage());
        }
        student.addGrade("Java", "A");
        student.addGrade("Python", "B+");
        student.addGrade("DBMS", "A+");
        student.viewGrades();
        service.drop(student, python);
    }
}
