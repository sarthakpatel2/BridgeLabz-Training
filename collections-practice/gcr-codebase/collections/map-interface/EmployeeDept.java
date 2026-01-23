import java.util.*;
//employee class
class Employee {
    private int id;
    private String name;
    private String department;
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public String getName() {
        return name;
    }
    //for readable output
    @Override
    public String toString() {
        return name + " (ID: " + id+ ")";
    }
}

// Main class
public class EmployeeDept{
    public static void main(String[] args) {
        //create employee list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Sanjh", "HR"));
        employees.add(new Employee(2, "Sarthak", "IT"));
        employees.add(new Employee(3, "Shivam", "HR"));
        employees.add(new Employee(4, "Madhav", "Finance"));
        employees.add(new Employee(5, "Aman", "IT"));
        //group employees by department
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        for (Employee emp : employees) {
            departmentMap.computeIfAbsent(emp.getDepartment(),k -> new ArrayList<>()).add(emp);
        }
        //display grouped employees
        System.out.println("Employees Grouped by Department:");
        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
}
