public class EmployeeTest{
    public static void main(String[] args){
        Employee[] employees=new Employee[2];
        employees[0]= new FullTimeEmployee(1, "Sarthak",50000);
        employees[1]=new PartTimeEmployee(2,"Shivam",100, 300);
        for (Employee emp:employees){
            emp.displayDetails();// polymorphism
            System.out.println();
        }
    }
}
abstract class Employee{
    private int employeeId;
    private String name;
    protected double baseSalary;
    //constructor
    public Employee(int employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    //abstract method
    public abstract double calculateSalary();
    //concrete method
    public void displayDetails(){
        System.out.println("ID: "+employeeId);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+calculateSalary());
    }
    //encapsulation using getter and setter
    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
}
//interface for dept
interface Department{
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}
//FullTimeEmployee class
class FullTimeEmployee extends Employee implements Department{
    private String department;
    public FullTimeEmployee(int id,String name,double salary){
        super(id,name,salary);
    }
    @Override
    public double calculateSalary(){
        return baseSalary;
    }
    @Override
    public void assignDepartment(String deptName){
        department=deptName;
    }
    @Override
    public String getDepartmentDetails(){
        return department;
    }
}
//PartTimeEmployee class
class PartTimeEmployee extends Employee implements Department{
    private int hoursWorked;
    private double hourlyRate;
    private String department;
    public PartTimeEmployee(int id,String name,int hours,double rate){
        super(id, name, 0);
        this.hoursWorked =hours;
        this.hourlyRate=rate;
    }
    @Override
    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }
    @Override
    public void assignDepartment(String deptName){
        department=deptName;
    }
    @Override
    public String getDepartmentDetails(){
        return department;
    }
}

