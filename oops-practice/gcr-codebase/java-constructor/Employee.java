class Employee{
    // access modifiers
    public int employeeID;
    protected String department;
    private double salary;
    //constructor
    Employee(int employeeID, String department, double salary){
        this.employeeID =employeeID;
        this.department= department;
        this.salary=salary;
    }
    // public method to modify salary
    public void updateSalary(double newSalary){
        if (newSalary>0){
            salary =newSalary;
        }
    }
    // Public getter for salary
    public double getSalary(){
        return salary;
    }
}
class Manager extends Employee{
    // subclass variable managerLevel
    String manLevel;
    // constructor
    Manager(int employeeID, String department, double salary, String managerLevel){
        // calling parent constructor
        super(employeeID, department, salary);
        this.manLevel=managerLevel;
    }
    void displayDetails(){
        // displaying details
        System.out.println("Employee ID: "+employeeID);// public
        System.out.println("Department: " +department);// protected
        System.out.println("Salary: ₹" +getSalary()); // private via method
        System.out.println("Manager Level: "+manLevel);
        System.out.println();
    }
    public static void main(String[] args){
        // defining Manager object
        Manager man=new Manager(501,"IT", 75000,"Intern");
        man.displayDetails();
        //update salary using public method
        man.updateSalary(70000);
        System.out.println("Updated Salary: ₹"+man.getSalary());
    }
}

