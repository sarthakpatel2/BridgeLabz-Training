class Employee{
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayDetails() {
        System.out.println("Name: "+ name);
        System.out.println("ID: " +id);
        System.out.println("Salary: "+ salary);
    }
}
//manager subclass
class Manager extends Employee{
    int teamSize;
    Manager(String name, int id, double salary,int teamSize){
        super(name, id,salary);
        this.teamSize=teamSize;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: "+teamSize);
    }
}
//developer subclass
class Developer extends Employee{
    String programLanguage;
    Developer(String name, int id, double salary, String programLanguage){
        super(name, id,salary);
        this.programLanguage=programLanguage;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: "+programLanguage);
    }
}
//intern subclass
class Intern extends Employee{
    int durationMonth;
    Intern(String name, int id, double salary, int durationMonth){
        super(name, id, salary);
        this.durationMonth=durationMonth;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Internship Duration: "+durationMonth+" months");
    }
}
//main class
public class EmployeeManagement{
    public static void main(String[] args) {
        Employee e1=new Manager("Sanjh",01,80000,10);
        Employee e2=new Developer("Sarthak",02,60000,"Java");
        Employee e3=new Intern("Madhav",03,35000,6);
        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
        System.out.println();
        e3.displayDetails();
    }
}
