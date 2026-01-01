class Employee{
    //static variables
    static String companyName="Tech Crades Inc.";
    static int totalEmployees=0;
    //instance variables
    String name;
    String designation;
    //final variable
    final int id;
    //constructor
    Employee(int id, String name,String designation) {
        this.id=id;
        this.name=name;
        this.designation=designation;
        // count employees
        totalEmployees++;
    }
    //static method
    static void displayTotalEmployees() {
        System.out.println("Total Employees: "+totalEmployees);
    }
    //display employee details using instanceof
    static void displayEmployeeDetail(Object obj){
        if (obj instanceof Employee){
            Employee e=(Employee) obj;
            System.out.println("Company Name: "+companyName);
            System.out.println("Employee ID: "+e.id);
            System.out.println("Name: "+e.name);
            System.out.println("Designation: "+e.designation);
        }
    }
    public static void main(String[] args){
        Employee emp1 =new Employee(111, "Shivam", "Software Engineer");
        Employee emp2= new Employee(112, "Sarthak", "Project Manager");
        //print total employees
        displayTotalEmployees();
        //display employee details
        displayEmployeeDetail(emp1);
        displayEmployeeDetail(emp2);
    }
}
