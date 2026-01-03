class Person {
    String name;
    int age;
    //constructor
    Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
//teacher subclass
class Teacher extends Person{
    String subject;
    Teacher(String name, int age,String subject){
        //parent constructor call
        super(name,age);
        this.subject=subject;
    }
    void displayRole(){
        System.out.println("Role: Teacher");
        display();
        System.out.println("Subject: "+subject);
    }
}
//student subclass
class Student extends Person{
    String grade;
    Student(String name, int age,String grade) {
        super(name,age);
        this.grade=grade;
    }
    void displayRole(){
        System.out.println("Role: Student");
        display();
        System.out.println("Grade: "+grade);
    }
}
//staff subclass
class Staff extends Person{
    String department;
    Staff(String name,int age,String department){
        super(name,age);
        this.department=department;
    }
    void displayRole(){
        System.out.println("Role: Staff");
        display();
        System.out.println("Department: "+department);
    }
}
//main class
public class SchoolSystem{
    public static void main(String[] args) {
        Person t=new Teacher("Aman",40,"Mathematics");
        Person s=new Student("Aditi",15,"10th Grade");
        Person st=new Staff("Ramesh",35,"Administration");
        ((Teacher) t).displayRole();
        System.out.println();
        ((Student) s).displayRole();
        System.out.println();
        ((Staff) st).displayRole();
    }
}
