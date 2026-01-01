class Student{
    //static variables
    static String universityName="GLA University";
    static int totalStudents =0;
    //instance variables
    String name;
    String grade;
    //final variable 
    final int rollNumber;
    //constructor using 'this'
    Student(int rollNumber,String name,String grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.grade=grade;
         // count students
        totalStudents++;
    }
    //static method to display total students
    static void displayTotalStudent(){
        System.out.println("Total Students Enrolled: "+totalStudents);
    }
    //display student details using instanceof
    static void displayStudentDetail(Object obj){
        if (obj instanceof Student) {
            Student s=(Student) obj;
            System.out.println("University Name: "+universityName);
            System.out.println("Roll Number: "+s.rollNumber);
            System.out.println("Name: "+s.name);
            System.out.println("Grade: "+s.grade);
        }
    }
    //update grade using instanceof
    static void updateGrade(Object obj,String newGrade){
        if (obj instanceof Student) {
            Student s=(Student) obj;
            s.grade=newGrade;
            System.out.println("Grade updated to: "+newGrade);
        }
    }
    public static void main(String[] args){
        Student s1=new Student(1593, "Sarthak","A");
        Student s2 =new Student(1406, "Sanjh", "A");
        //display total students
        displayTotalStudent();
        //display student details
        displayStudentDetail(s1);
        displayStudentDetail(s2);
        //update the grade
        updateGrade(s2, "A+");
        //display updated student details
        displayStudentDetail(s2);
    }
}
